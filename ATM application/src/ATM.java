import java.util.Scanner;

public class ATM {
    private static double balance = 1000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Machine");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash();
                    break;
                case 3:
                    depositCash();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void withdrawCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance is: $" + balance);
        }
    }

    private static void depositCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }
}
