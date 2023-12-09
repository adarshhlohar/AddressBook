package com.bridgelabz;
import java.util.Scanner;

public class HashMapAddressBook {
	public static void main(String[] args) {
		System.out.println("Hii and Welcome to MY ADDRESS BOOK Project !!!");
		AddressBook ad = new AddressBook();
		do {
			System.out.println("Enter 1 for adding new Address Book \nEnter 2 for display Address Book Names  \nEnter 3 for exit from the Address Book");
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
				if(isYes == 'y' || isYes == 'Y') {
					ad.displayAddressBookDetail();
				}
				break;
			case 3:
				System.out.println("Exiting the Address Book");
				System.exit(0);
			}
		} while (true);
	}
}
