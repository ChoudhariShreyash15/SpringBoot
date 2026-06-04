package com.account.test;

import com.account.Account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1, "Savings", 50000);
        System.out.println("1. Deposit \n2. Withdraw \n3. Display Balance \n4. Exit");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    System.out.println("Amount deposited successfully.");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
