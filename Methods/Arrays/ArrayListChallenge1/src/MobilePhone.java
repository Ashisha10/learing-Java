import java.util.ArrayList;

public class MobilePhone {
    private String num;
    private String name;
    public static ArrayList<Contact> contactList = new ArrayList<>();
    void addNumber(String name, String num) {
        contactList.add(new Contact(name, num));
    }

    void printContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(i + 1 + ". " + contactList.get(i).getName() + "- " + contactList.get(i).getNum());
        }
    }

    void printContacts(int pos) {
        System.out.println(pos + ". " + contactList.get(pos-1).getName() + "- " + contactList.get(pos-1).getNum());
    }

    void rmNum(String rmCon) {
        int idx = contactList.indexOf(rmCon);
        if (idx >= 0) {
            contactList.remove(idx);
        }
    }

    void updateContact(String newName, String newNum, int pos) {
        Contact newContact = new Contact(newName, newNum);
        contactList.set(pos - 1, newContact);
    }

    void updateContact(String newName, String newNum, String oldContact) {
        Contact newContact = new Contact(newName, newNum);
        int pos = contactList.indexOf(oldContact);
        contactList.set(pos, newContact);
    }

    void searchContact(int pos) {
        if (pos >= 0) {
            System.out.println(contactList.get(pos - 1));
        } else {
            System.out.println("not found");
        }
    }

    void searchContact(String name) {
        int pos = contactList.indexOf(name);
        if (pos >= 0) {
            System.out.println(contactList.get(pos));
        } else {
            System.out.println("not found");
        }
    }

    void quitting(int num) {
        if (num == 6) {
            return;
        }
    }

}
