package classes;

public class ContactsManager {
    // fields
    Contact[] friendsList;
    int friendsCount;

    // constructor
    ContactsManager() {
        friendsList = new Contact[500];
        friendsCount = 0;
    }

    // methods
    void addContact(Contact contact) {
        friendsList[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for(int i = 0; i < friendsCount; i++) {
            if (friendsList[i].name.equals(searchName)) {
                System.out.println("["+friendsList[i].name+"] "
                        +friendsList[i].phoneNumber
                        +" "+friendsList[i].email);
                return friendsList[i];
            }
        }
        System.out.println("No Match");
        return null;
    }

    void listAllContacts() {
        for(int i = 0; i < friendsCount; i++) {
            Contact contact = friendsList[i];
            System.out.println((i+1)
                    + ": [" + contact.name + "] "
                    + contact.phoneNumber
                    + " "
                    + contact.email);
        }
    }
}
