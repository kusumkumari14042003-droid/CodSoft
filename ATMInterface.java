import java.util.Scanner;

// (4) Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }
}

// (1)(2)(3)(5)(6)(7) ATM Class
class ATM {
    private BankAccount acc;
    private Scanner sc;

    public ATM(BankAccount a) {
        this.acc = a;
        this.sc = new Scanner(System.in);
    }

    public void menu() {
        int choice;
        double amount;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (acc.withdraw(amount))
                        System.out.println("✅ Withdrawal successful. Balance: " + acc.getBalance());
                    else
                        System.out.println("❌ Insufficient balance or invalid amount.");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    if (acc.deposit(amount))
                        System.out.println("✅ Deposit successful. Balance: " + acc.getBalance());
                    else
                        System.out.println("❌ Invalid deposit amount.");
                    break;

                case 3:
                    System.out.println("💰 Current Balance: " + acc.getBalance());
                    break;

                case 4:
                    System.out.println("👋 Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
                    break;
            }

        } while (choice != 4);
    }
}

// (Main Class renamed to AtmInterface)
public class AtmInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initial balance Rs 1000
        ATM atm = new ATM(account);
        atm.menu();
    }
}
