import java.util.Scanner;

public class ATMSimulation {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your balance: ");
        int balance = sc.nextInt();

        int choice;

        while (true) {
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance: " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Money deposited successfully!");
            }
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Money withdrawn successfully!");
                }
                else {
                    System.out.println("Insufficient balance!");
                }
            }
            else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            }
            else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
