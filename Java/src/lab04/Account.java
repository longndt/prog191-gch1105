package lab04;

public class Account {
    private String name;
    private double balance;

    public Account (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw (double amount) {
        if (amount <= balance)
             balance -= amount;
        else
            System.err.println("Invalid withdraw amount !");
    }

    public void deposit (double amount) {
        if (amount > 1)
            balance += amount;
        else
            System.err.println("Invalid deposit amount !");
    }

    public void transfer (Account account, double money) {
        if (this.balance >= 1 && money >= 1 && money <= this.balance)  {
            //decrease sender's balance
            this.balance -= money;
            //increase recipient's balance
            account.balance += money;
        } else {
            System.err.println("Transfer money failed !");
        }
    }

    public void showBalance () {
        System.out.println("Account name: " + name);
        System.out.println("Account balance : " + balance + "$");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
