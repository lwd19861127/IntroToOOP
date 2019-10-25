package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book harryPort = new Book("HarryPort", "J.K");
        System.out.println(harryPort.getTitle());
        System.out.println(harryPort.getAuthor());

        harryPort.setBorrowed(true); // setting new isBorrowed field
        System.out.println(harryPort.isBorrowed());

        Person shochan = new Person("Shochan123", "123456");
        Person kamchan = new Person("Kamchan123", "654321");
        System.out.println(shochan.isSamePerson(kamchan));
    }
}
