package OOPsConcept.Project.BankingSystem;

abstract class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // encapsulation - getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // deposit method (common to all)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method (common to all)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance = " + balance);
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    // abstract method - must be implemented differently by subclasses
    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5%

    public SavingsAccount(String name, int number, double balance) {
        super(name, number, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("Interest for Savings Account: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(String name, int number, double balance) {
        super(name, number, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }

    public void useOverdraft(double amount) {
        if (amount <= overdraftLimit) {
            System.out.println("Using overdraft of " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Shreyash", 101, 10000);
        BankAccount current = new CurrentAccount("Pratik", 102, 20000);

        System.out.println("\n--- Savings Account ---");
        savings.deposit(2000);
        savings.withdraw(1500);
        savings.calculateInterest();

        System.out.println("\n--- Current Account ---");
        current.deposit(3000);
        current.withdraw(5000);
        current.calculateInterest();

        // Downcasting to access specific method
        CurrentAccount ca = (CurrentAccount) current;
        ca.useOverdraft(4000);
    }
}