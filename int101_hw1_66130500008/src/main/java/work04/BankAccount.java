package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    public void transfer(double amount, BankAccount account) {
        // Withdraw from this account
        withdraw(amount);

        // Deposit into the target account
        account.deposit(amount);

    }

    @Override
    public String toString(){
        return "BankAccount { number = " + number + ", owner = " + owner + ", balance = " + balance + '}';
    }

}
