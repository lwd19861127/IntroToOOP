package encapsulation;

public class Person {
    private String userName;
    private String sin;

    public Person(String userName, String sin) {
        this.userName = userName;
        this.sin = sin;
    }

    public String getUserName() {
        return userName;
    }

    private String generateId () {
        return sin + "!!" + userName + "%%";
    }

    public boolean isSamePerson(Person other) {
       return this.generateId().equals(other.generateId());
    }
}
