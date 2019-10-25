package inheritance;

import javax.crypto.spec.PSource;

public class Driver {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Adafd",1,1);
        BankAccount acc2 = new BankAccount("Adafd",1,1);

        System.out.println(acc1.equals(acc2));
        // protected members (fields / methods)

        CheckingAccount cacc1 = new CheckingAccount("A123", 9203, 123, 423423);
    }
}
