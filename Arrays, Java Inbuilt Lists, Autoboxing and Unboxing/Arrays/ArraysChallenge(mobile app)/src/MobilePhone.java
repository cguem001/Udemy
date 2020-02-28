import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;

    ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            System.out.println("The contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replace with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", has been deleted");
        return true;
    }


}
