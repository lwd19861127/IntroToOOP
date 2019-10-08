import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        // how to print integer from 1 to 10? with for-loop
        // for-loop syntax (java)
        // for (initialize loop variable; condition; inc or dec)
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+", ");
        }
        for (int i = 1; i<=20; i++) {
            if (i % 10 == 0) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + ", ");
            }
        }
        // for(;;) {} infinite loop

        // print even numbers from 1 to 10 using while-loop
        int i = 1;
        while (i<=10) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
