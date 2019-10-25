package inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    protected int bankCode;

    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.bankCode = 0;
    }

    public BankAccount(String accountNumber, int bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public final String getAccountNumber() {
        return accountNumber;
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public final double getBalance() {
        return balance;
    }

    public final void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        // down-casting
        return this.accountNumber.equals(((BankAccount) obj).accountNumber);
    }
}
