package StudiKasus2;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override final method
    /*
    @Override
    public void displayAccountInfo() {
        // ERROR: Cannot override the final method from BankAccount
    }
    */

    // Cara alternatif: tambahkan method baru yang khusus
    public void displayWithInterest(double interestRate) {
        double futureBalance = balance + (balance * interestRate);
        System.out.println("Future Balance (with interest): $" + futureBalance);
    }
}
