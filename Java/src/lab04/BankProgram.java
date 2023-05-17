package lab04;

public class BankProgram {
    public static void main(String[] args) {
        Account acc1 = new Account("Huong", 999.99);
        Account acc2 = new Account("Linh", 1286.68);
        Account acc3 = new Account("Nhung", 666.66);
        Account acc4 = new Account("Hoa", 1234.56);

        Account[] accountList1 = {acc1, acc2};
        Account[] accountList2 = {acc3, acc4};

        Bank bank1 = new Bank("Vietcombank", accountList1);
        Bank bank2 = new Bank("TPBank", accountList2);

        System.out.println("Vietcombank account list:");
        bank1.displayAccounts();
        System.out.println("TPBank account list:");
        bank2.displayAccounts();

        System.out.println("Testing deposit feature");
        System.out.println("Account 1's current balance: " + acc1.getBalance() + "$");
        System.out.println("Account 1 deposit 100$");
        acc1.deposit(100);
        System.out.println("Account 1's updated balance: " + acc1.getBalance() + "$");

        System.out.println("Testing withdraw feature");
        System.out.println("Account 2's current balance: " + acc2.getBalance() + "$");
        System.out.println("Account 2 withdraw 200$");
        acc2.withdraw(200);
        System.out.println("Account 2's updated balance: " + acc1.getBalance() + "$");

        System.out.println("Testing money transfer feature");
        System.out.println("Account 3 (SENDER) current balance: " + acc3.getBalance() + "$");
        System.out.println("Account 4 (RECIPIENT) current balance: " + acc4.getBalance() + "$");
        double amount = 268.86;
        System.out.println("Account 3 (SENDER) transfer to Account 4 (RECIPIENT) with an amount of " + amount + "$");
        acc3.transfer(acc4, amount);
        System.out.print("Account 3 (SENDER) updated balance: ");
        System.out.printf("%.2f",acc3.getBalance());
        System.out.print("$");
        System.out.print("\nAccount 4 (RECIPIENT) updated balance: ");
        System.out.printf("%.2f",acc4.getBalance());
        System.out.print("$");

    }
}
