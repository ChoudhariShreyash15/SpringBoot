package OOPsConcept.JavaOopsAssignment.Q10account;

public class Account{
    int acctId;
    String acctType;
    double acctBalance;

    public Account(int acctId, String acctType, double acctBalance) {
        this.acctId = acctId;
        this.acctType = acctType;
        this.acctBalance = acctBalance;
    }

    public Account() {}

    public void deposit(int amount){
        acctBalance += amount;
    }

    public void withdraw(int amount){
        if (acctBalance >= amount){
            acctBalance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance(){
        return (int) acctBalance;
    }

    public void display(){
        System.out.println("Account ID: " + acctId);
        System.out.println("Account Type: " + acctType);
        System.out.println("Account Balance: " + acctBalance);
    }
}