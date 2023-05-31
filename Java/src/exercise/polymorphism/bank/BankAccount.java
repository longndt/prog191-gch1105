package exercise.polymorphism.bank;

abstract class BankAccount {
    private final String accountNumber;
    double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}