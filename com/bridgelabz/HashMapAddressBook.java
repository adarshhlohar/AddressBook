package com.bridgelabz;

import java.util.Scanner;

public class HashMapAddressBook {
	public static void main(String[] args) {
		System.out.println("Hii and Welcome to MY ADDRESS BOOK Project !!!");
		AddressBook ad = new AddressBook();
		do {
			System.out.println(
					"Enter 1 for adding new Address Book. \nEnter 2 for display Address Book Names. \nEnter 3 Finding person by using the city name. \nEnter 4 Find the count of persons in the city \nEnter 5 for the sort by name and print \nEnter 6 for exit from the Address Book.");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch (input) {
				case 1: {
					ad.addAddressBook();
					break;
				}
				case 2:
					ad.displayAddressBookByUniqueName();
					System.out.println("If you want to see the Address Book y/n?");
					char isYes = sc.next().charAt(0);
					if (isYes == 'y' || isYes == 'Y') {
						ad.displayAddressBookDetail();
					}
					break;
				case 3:
					System.out.println("Enter the name of city you want find person");
					String city = sc.next();
					ad.findPersonUsingCityName(city);
					break;
				case 4:
					System.out.println("Enter the city of you want find count of person");
					String city1 = sc.next();
					ad.countPersonByCity(city1);
					break;
				case 5:
					System.out.println("Sorting the people .......!");
					ad.sortByPeopleName();
					break;
				case 6:
					System.out.println("Exiting the Address Book");
					System.exit(0);
			}
		} while (true);
	}
}
