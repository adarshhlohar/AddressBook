import java.util.Scanner;

public class AddressBook{
    public static void main(String[] args) {
        System.out.println("Hii and Welcome to MY ADDRESS BOOK Project !!!");
        AddContact add = new AddContact();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu Enter 1 for add Contact \nEnter 2 for edit contact");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    add.addContact();
                    add.display();
                    break;
            

                case 2:
                    add.editContact();
                    add.display();

                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Youre Entered Wrong Input Please input right input");
                    break;
            }
        }while(true);
    }
}