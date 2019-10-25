package classes;

public class Client {
    public static void main(String[] args) {
        Contact rick = new Contact("Rick",
                                   "ricktang1991@gmail.com",
                            "778.986.8986");
        Contact dan = new Contact("Dan",
                                   "souzadanbr@gmail.com",
                            "236.668.7354");

        ContactsManager app = new ContactsManager();
        app.addContact(rick);
        app.addContact(dan);
        app.searchContact("Rick");

        app.listAllContacts();
    }
}
