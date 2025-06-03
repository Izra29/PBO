package StudiKasus2;

public class BankAccount {
    private final String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

