package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddressBook {

	/*
	 * here we have created the object of AddContact Class we can access the methods
	 * in the AddContact After That do While Loop In and in this we will Created a
	 * Switch case The while loop Always true it flase when the user will enter
	 * valid exit input
	 */
	HashMap<String, ArrayList<ContactDetail>> addressBook = new HashMap<>();
	ArrayList<ContactDetail> list = new ArrayList<>();
	AddContact addContact = new AddContact();
	Scanner sc = new Scanner(System.in);

	public void addAddressBook() {
		list = new ArrayList<>();
		list.clear();
		System.out.println("Enter The Unique Name for the Address book");
		String key = sc.next();

		boolean b = true;
		while (b) {
			System.out.println();
			addContact();

			System.out.println("If you want add more contact y/n");
			char input = sc.next().charAt(0);
			if (input == 'y' || input == 'Y') {
				b = true;
				addressBook.put(key, list);
			} else {
				addressBook.put(key, list);
				b = false;
			}
		}

		System.out.println("this is list");
		System.out.println(list);

		addressBook.put(key, list);
	}

	public void displayAddressBookByUniqueName() {
		for (Map.Entry<String, ArrayList<ContactDetail>> obj : addressBook.entrySet()) {
			System.out.println("The key is : " + obj.getKey());
			ArrayList<ContactDetail> contact = obj.getValue();
			for (ContactDetail c : contact) {
				System.out.println(c.toString());
			}
		}
	}

	public void displayAddressBookDetail() {
		System.out.println("Enter the  Address Book Name You want see the Contact Detail");
		String AddressBookName = sc.next();
		boolean isAddressBookPresent = addressBook.containsKey(AddressBookName);
		if (isAddressBookPresent) {
			ArrayList<ContactDetail> contactDetail = addressBook.get(AddressBookName);
			for (ContactDetail c : contactDetail) {
				System.out.println(c.toString());
			}
		}
	}

	void addContact() {
		Scanner sc = new Scanner(System.in);
		ContactDetail contact = new ContactDetail();
		System.out.println("Enter the first name:");
		String name = sc.next();
		if(!isPersonNameIsUnique(name)){
			contact.setFirstName(name);
			System.out.println("Enter the last name:");
			contact.setLastName(sc.next());
			System.out.println("Enter the address:");
			contact.setAddress(sc.next());
			System.out.println("Enter the city:");
			contact.setCity(sc.next());
			System.out.println("Enter the state:");
			contact.setState(sc.next());
			System.out.println("Enter the zip code:");
			contact.setZipCode(sc.next());
			System.out.println("Enter the phone number:");
			contact.setPhoneNumber(sc.next());
			System.out.println("Enter the email_id:");
			contact.setEmailId(sc.next());
			list.add(contact);
		}else{
			System.out.println("Please Enter the unique name !!!");
		}
	}

	void display(ArrayList<ContactDetail> list2) {
		System.out.println(list2.toString());
	}

	void displayAddressBook() {

	}

	public boolean isPersonNameIsUnique(String name){
		long countName = 0;
		for(Map.Entry<String,ArrayList<ContactDetail>> elem : addressBook.entrySet()){
			String addressBookName = elem.getKey();
			System.out.println(addressBookName);
			ArrayList<ContactDetail> contacts = elem.getValue(); 
			countName = contacts.stream().filter(n -> n.getFirstName().equals(name)).count();
		}
		if(countName > 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void findPersonUsingCityName(String city){
		for(Map.Entry<String,ArrayList<ContactDetail>> elem : addressBook.entrySet()){
			ArrayList<ContactDetail> contacts = elem.getValue();
			List<ContactDetail> cityPerson = contacts.stream().filter(n -> n.getCity().equals(city)).collect(Collectors.toList());
			for(ContactDetail c : cityPerson){
				System.out.println(c.toString());
			}
		}
		
	}

}