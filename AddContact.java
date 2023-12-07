import java.util.ArrayList;
import java.util.Scanner;

/*
 * In this class we can we persform the operation addContact,editContact,displayContact 
 * And deleteContact
 */
public class AddContact {

    //Use Case 5- We can Add the multiple person in Address Book
    /*
     * Here we can created Arraylist which store the object of ContactDetail class
     */
    ArrayList<ContactDetail> list = new ArrayList<>();

    // Use Case-2 Ability to add a new Contact to Address Book
    /*
     * Here we can created a method of add Detail in which we cannot pass any input
     * in this method we can craeted a ContactDetail class object after creating we
     * call the
     * we setter from the ContactDetail and direct provide the value by using the
     * Scanner class
     * object and it will set.
     * After setting the all parameter of contact we can add the contact object in
     * ArrayList
     */
    void addContact() {
        Scanner sc = new Scanner(System.in);
        ContactDetail contact = new ContactDetail();
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

    /*
     * @param We can created a display method which cannot be give any parameter.
     * 
     * @return it cannot return anything
     * the display method is displaying the data from the list by using the toString
     * method
     */
    void display() {
        System.out.println(list.toString());
    }

    // Use Case3: method for editing the existing contact
    /*
     * In this this editContact Function we can edit the Contact if the name of the
     * person will
     * found first we created the for loop which can iterate throw the list if the
     * name of the
     * person find then it will found the index in that index we can inserting
     * updated data
     */
    void editContact() {
        Scanner sc = new Scanner(System.in);
        boolean isPersonFound = false;
        int indexOfPerson = 0;
        System.out.println("Enter name for editing an existing contact:");
        String firstName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equals(firstName)) {
                isPersonFound = true;
                indexOfPerson = i;
                break;
            }
        }
        if (isPersonFound) {
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
        } else {
            System.out.println("Sorry,name  not found");
        }
        sc.close();
    }

    // Use Case3: method for editing the existing contact
    /*
     * In this deleteContact method we can iterarte throw the for loop in this if
     * the name will
     * found then it will make true to the isPersonFound after that wecan remove the
     * object
     * from the list by using the removeIf
     */
    void deleteContact() {
        boolean isPersonFound = false;
        int indexOfPerson = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name for deleting an existing contact:");
        String firstName = scan.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equals(firstName)) {
                isPersonFound = true;
                indexOfPerson = i;
                break;
            }
        }

        if (isPersonFound) {
            list.removeIf(elem -> elem.getFirstName().equals(firstName));
            System.out.println("The name is successfully");
        } else {
            System.out.println(firstName + " person was not found");
        }
    }
}