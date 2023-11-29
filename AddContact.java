
import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
    
    ArrayList<ContactDetail> list = new ArrayList<>();
    //Use Case-2 Ability to add a new Contact to Address Book
    void addContact() {
        Scanner sc = new Scanner(System.in);
            ContactDetail contact = new ContactDetail();
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
            list.add(contact);
}

    void display(){
            System.out.println(list.toString());
    }

//Use Case3: method for editing the existing contact
void editContact() {
    Scanner sc = new Scanner(System.in);
    boolean isPersonFound=false;
    int indexOfPerson=0;
    System.out.println("Enter name for editing an existing contact:");
    String firstName = sc.next();
    for(int i=0; i<list.size(); i++) {
        if(list.get(i).getFirstName().equals(firstName)) {
            isPersonFound=true;
            indexOfPerson=i;
            break;
        }
    }
    if(isPersonFound) {
        System.out.println("Update the first name:");
        list.get(indexOfPerson).setFirstName(sc.next());
        System.out.println("Update Last Name: ");
        list.get(indexOfPerson).setLastName(sc.next());
        System.out.println("Update address: ");
        list.get(indexOfPerson).setAddress(sc.next());
        System.out.println("Update city: ");
        list.get(indexOfPerson).setCity(sc.next());
        System.out.println("Update state: ");
        list.get(indexOfPerson).setState(sc.next());
        System.out.println("Update zip code: ");
        list.get(indexOfPerson).setZipCode(sc.next());
        System.out.println("Update phone number: ");
        list.get(indexOfPerson).setPhoneNumber(sc.next());
        System.out.println("Update email_id: ");
        list.get(indexOfPerson).setEmailId(sc.next());
    }
    else {
        System.out.println("Sorry,name  not found");
    }
    sc.close();
}
}