package setter;

public class Account12 {

    int accountNo;
    String accountType;
    int accountBalance;

    void setAccountDetails(int accountNo, String accountType, int accountBalance){
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    int withdraw(int amount){
        if (accountBalance >= amount){
            accountBalance -= amount;
            return accountBalance;
        }
        else {
            System.out.println("Insufficient balance");
            return accountBalance;
        }
    }

    int deposit(int amount){
        accountBalance += amount;
        return accountBalance;
    }

    void dispAccountDetails(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}

class Main1{
    public static void main(String[] args) {
        Account12 acc = new Account12();
        acc.setAccountDetails(1234567890, "Savings", 5000);
        acc.withdraw(6000);
        acc.deposit(6000);
        acc.dispAccountDetails();
    }
}