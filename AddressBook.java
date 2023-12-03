import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Hii and Welcome to MY ADDRESS BOOK Project !!!");
        AddContact add = new AddContact();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu: \nenter 1 - adding contact" + " " + "\nenter 2 - editing contact" + " "
                    + "\nenter 3 - deleting contact" + " " + "\nenter 4 - to exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    add.addContact();
                    add.display();
                    break;

                case 2:
                    add.editContact();
                    add.display();
                    break;
                case 3:
                    add.deleteContact();
                    add.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }
}