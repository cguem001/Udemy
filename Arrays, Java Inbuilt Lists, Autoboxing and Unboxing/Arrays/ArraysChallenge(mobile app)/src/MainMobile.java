import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MainMobile {


    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("91 638 09 06");



    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }



        while(!quit){

            System.out.println("Starting phone...");
            System.out.println("\t 1 - Print list of contacts");
            System.out.println("\t 2 - Add new contact");
            System.out.println("\t 3 - Update existing contact");
            System.out.println("\t 4 - Delete contact");
            System.out.println("\t 5 - Search contact");
            System.out.println("\t 6 - Close application");
            int input = sc.nextInt();


        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of the contact");
        String name = sc.nextLine();
        sc.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null) {
            System.out.println("This contact does not exist");
            return;
        }

        System.out.println("Enter new name");
        String newName = sc.nextLine();
        System.out.println("Enter new phone number");
        String newNumber = sc.nextLine();
        sc.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)) {
            System.out.println("Contact updated");
        } else{
            System.out.println("Error updating recording");
        }
    }

    public static void removeContact() {
        System.out.println("Please enter the name of the contact to be deleted");{
            String name = sc.nextLine();
            Contacts existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null) {
                System.out.println("Contact not found");
                return;
            }

            if(mobilePhone.removeContact(existingContactRecord)) {
                System.out.println("Contact deleted");
            } else {
                System.out.println("Error deleting contact");
            }

        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = sc.nextLine();
        sc.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("The name " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getNumber());
    }

    private static void addNewContact(){
        System.out.println("Enter new name contact");
        String name = sc.nextLine();
        System.out.println("Enter new number contact");
        String number = sc.nextLine();
        sc.nextLine();

        Contacts newContact = Contacts.createContact(name,number);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }


    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("\t 0 - To shutdown\n" +
                "\t 1 - To print contacts\n" +
                "\t 2 - To add a new contact\n" +
                "\t 3 - to update an existing contact\n " +
                "\t 4 - to remove an existing contact\n" +
                "\t 5 - query item existing contact exists" +
                "\t 6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
