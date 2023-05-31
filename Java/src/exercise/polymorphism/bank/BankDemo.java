package exercise.polymorphism.bank;


public class BankDemo {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SA001", 0.05);
        accounts[1] = new CurrentAccount("CA001", 500);

        // Deposit into each account
        accounts[0].deposit(1000);
        accounts[1].deposit(2000);

        // Withdraw from each account
        accounts[0].withdraw(500);
        accounts[1].withdraw(3000);

        // Display the balance of each account
        for (BankAccount account : accounts) {
            account.displayBalance();
        }

        // Generate account statement for each account
        for (BankAccount account : accounts) {
            if (account instanceof AccountStatement statement) {
                statement.generateStatement();
            }
        }
    }
}