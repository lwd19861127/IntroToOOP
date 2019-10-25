package inheritance;

// -because my superclas has non-default constructor!
// -(ex) BackAccount(String accountNumber, ... ) {}
// - every instance of subclasses has to call super class' constructor(super())

public class CheckingAccount extends BankAccount {
    private long limit;

    public CheckingAccount(String accountNumber, double balance, int bankCode, long limit) {
        // YOU MUST HAVE THIS! super()
        super(accountNumber, balance, bankCode);
        this.limit = limit;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }
}
