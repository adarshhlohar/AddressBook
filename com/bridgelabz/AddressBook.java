package com.bridgelabz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {

	/*
	 * here we have created the object of AddContact Class we can access the methods
	 * in the AddContact After That do While Loop In and in this we will Created a
	 * Switch case The while loop Always true it flase when the user will enter
	 * valid exit input
	 */
	AddContact add = new AddContact();
	HashMap<String, AddContact> addressBook = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void addAddressBook() {
		System.out.println("Enter The Unique Name for the Address book");
		String key = sc.next();
//			System.out.println("Menu: \nenter 1 - adding contact" + " " + "\nenter 2 - editing contact" + " "
//					+ "\nenter 3 - deleting contact" + " " + "\nenter 4 - If you want to exit");

		System.out.println("How may Contact You want Add in this AddressBook");
		int contactLength = sc.nextInt();

		for (int i = 0; i < contactLength; i++) {
			System.out.println();
			add.addContact();
//			add.display();
		}
//		System.out.println("If you want to edit Some Contact Enter Y");
//		char editContact = sc.next().charAt(0);
//		if (editContact == 'y' || editContact == 'Y') {
//			add.editContact();
//			add.display();
//		}
//
//		System.out.println("If you want to delete Some Contact Enter y");
//		char deleteContact = sc.next().charAt(0);
//		if (deleteContact == 'y' || deleteContact == 'Y') {
//			add.deleteContact();
//			add.display();
//		}
		addressBook.put(key, add);
	}

	public void displayAddressBookByUniqueName() {
		for (Map.Entry<String, AddContact> obj : addressBook.entrySet()) {
			System.out.println("The key is : " + obj.getKey());
		}
	}
	
	public void displayAddressBookDetail() {
		System.out.println("Enter the  Address Book Name You want see the Contact Detail");
		String AddressBookName = sc.next();
		boolean isAddressBookPresent = addressBook.containsKey(AddressBookName);
		if(isAddressBookPresent) {
			AddContact ContactDetail = addressBook.get(AddressBookName);
			ContactDetail.display();
		}
	}

}