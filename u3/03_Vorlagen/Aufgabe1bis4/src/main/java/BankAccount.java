public class BankAccount {
    private final long accountNumber;
    private double balance;
    private BankCustomer bankCustomer;

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (this.balance - amount < 0) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public boolean sameCustomer(BankAccount other) {
        return this.bankCustomer == other.bankCustomer;
    }

    public BankManager getManager() {
        return this.bankCustomer.getBankManager();
    }

    public void print() {
        IO.println(
                "===========================\n" +
                "BankAccount " + this.accountNumber + ":\n" +
                "balance = " + this.balance + "\n" +
                "bankCustomer = "
        );
        bankCustomer.print();
        IO.println("===========================\n");
    }
}
