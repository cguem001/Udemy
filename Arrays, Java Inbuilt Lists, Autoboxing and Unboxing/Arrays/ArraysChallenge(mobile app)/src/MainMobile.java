import java.util.Scanner;

public class MainMobile {


    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("91 638 09 06");

    boolean quit = false;
    startPhone();
    printActions();
    while(!quit) {

    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("\t Print list of contacts");
        System.out.println("\t Add new contact");
    }

    public static void main(String[] args) {





        while(!quit){

            System.out.println("Starting phone...");
            System.out.println("\t 1 - Print list of contacts");
            System.out.println("\t 2 - Add new contact");
            System.out.println("\t 3 - Update existing contact");
            System.out.println("\t 4 - Delete contact");
            System.out.println("\t 5 - Search contact");
            System.out.println("\t 6 - Close application");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    printListOfContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    option = false;

            }
        }


    }

    public static void printListOfContacts() {
        contacts.printContacts();
    }

    public void addContact() {
        System.out.println("Please enter a name");
        Contacts.createContact(sc.nextLine(),sc.nextLine());
        myContacts.add
        sc.nextLine();
//        System.out.println("Please enter a number");
//        contacts.addContactNumber(sc.nextInt());
//        System.out.println("Contact successfully added");
    }

    public static void modifyContact(){}

    public static void removeContact(){}

    public static void searchContact() {}


}
