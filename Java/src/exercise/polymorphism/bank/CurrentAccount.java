package exercise.polymorphism.bank;

class CurrentAccount extends BankAccount {
    private final double overdraftLimit;

    public CurrentAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        super.balance += amount;
    }

    public void withdraw(double amount) {
        if (super.balance - amount >= -overdraftLimit) {
            super.balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}