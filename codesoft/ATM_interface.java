import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class Main {
    private BankAccount account;

    public Main(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performAction(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = sc.nextInt(                deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                int withdrawAmount = sc.nextInt();
                withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void checkBalance() {
        System.out.println("\nCurrent balance: " + account.getBalance());
    }

    public void deposit(int amount) {
        account.deposit(amount);
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Main atm = new Main(account);
        Scanner sc = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            atm.performAction(choice);
        }
    }
}