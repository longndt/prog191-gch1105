package exercise.polymorphism.bank;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interest = amount * interestRate;
        super.balance += amount + interest;
    }

    public void withdraw(double amount) {
        super.balance -= amount;
    }
}