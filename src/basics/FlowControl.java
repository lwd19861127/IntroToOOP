package basics;

public class FlowControl {
    public static void main(String[] args) {
        // if-else statement
        // (): parenthesis
        // {}: curly braces
        // []: square brackets
        int age = 11;
        if (age > 21) {
            System.out.println("You can drink");
        } else if (age > 18 && age <=21) {
            System.out.println("You can smoke");
        } else if (age > 10 && age <=18) {
            System.out.println("You don't think about it");
        } else {
            System.out.println("Go home");
        }

        // switch statement
        int salary = 1_000_000;
        switch (salary) {
            case 1_000_000:
                System.out.println("Pretty good for everyone");
                break; // falls through without break
            case 50000:
                System.out.println("Pretty goog Junior Developer!");
                break;
            case 45000:
                System.out.println("Junior Developer!");
                break;
            default:
                System.out.println("else");
                break;
        }
    }
}
