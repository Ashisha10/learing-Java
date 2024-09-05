import java.util.ArrayList;

public class MobilePhone {
    public static ArrayList<Contact> contactArrayList = new ArrayList<>();
    private String name;
    private String num;
    Contact c = new Contact(name, num);
    boolean findContact(Contact cc) {
        cc = new Contact(name, num);
        for (Contact contact : contactArrayList) {
            if (contact.getName().equals(name) && contact.getNum().equals(num)) {
                return true;
            }
        }
        return false;
    }

    void addContact(Contact cc) {
        cc = new Contact(name, num);
        if(!findContact(cc)) {
            Contact newContact = new Contact(name, num);
            contactArrayList.add(newContact);
        }
    }

    void printContacts() {
        for (int i = 0; i < contactArrayList.size(); i++) {
            System.out.println(i + 1 + ". " + contactArrayList.get(i).getName() + "- " + contactArrayList.get(i).getNum());
        }
    }

    int findContactIdx(Contact contact) {
        return contactArrayList.indexOf(contact);
    }


    void printContacts(int pos) {
        System.out.println(pos + ". " + contactArrayList.get(pos - 1).getName() + "- " + contactArrayList.get(pos - 1).getNum());
    }

    void updateContact(int pos, Contact oldCon, Contact newCon) {
        if(findContactIdx(newCon) != -1 && !findContact(newCon)) {
            System.out.println("cannot change name to an already existing one");
        }
        contactArrayList.get(pos - 1).setName(name);
        contactArrayList.get(pos - 1).setName(num);
    }

    void rmContact(int pos) {
        contactArrayList.remove(pos - 1);
    }

    //    void rmContact(String name) {
//        int i = 0;
//        for (i = 0; i < contactArrayList.size(); i++) {
//            if (name == contactArrayList.get(i).getName()) {
//                break;
//            }
//        }
//        contactArrayList.remove(i);
    // }
    void rmContact(String name) {
        boolean removed = contactArrayList.removeIf(contact -> name.equals(contact.getName()));
        if (removed) {
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found with name: " + name);
        }
    }

}
