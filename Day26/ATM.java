package Day26;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter Amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter Amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Updated Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
    

