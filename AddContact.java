import java.util.Scanner;

public class AddContact {
    
    //Use Case-2 Ability to add a new Contact to Address Book
    void addContact() {
            ContactDetail contact = new ContactDetail();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first name:");
            contact.setFirstName(sc.next());
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
            sc.close();
}
}