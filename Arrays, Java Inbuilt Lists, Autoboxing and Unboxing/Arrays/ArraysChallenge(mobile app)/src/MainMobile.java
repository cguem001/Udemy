import java.util.Scanner;

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
                  //  updateContact();
                    break;
                case 4:
                   // removeContact();
                    break;
                case 5:
                   // queryContact();
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

    private static void addNewContact(){
        System.out.println("Enter new name contact");
        String name = sc.nextLine();
        sc.nextLine();
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
                "\t 3 - to update existing an existing contact\n " +
                "\t 4 - to remove an existing contact\n" +
                "\t 5 - query item existing contact exists" +
                "\t 6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
