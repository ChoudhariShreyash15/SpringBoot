package Exceptions.UserDefinedExceptions;

class WithdrawException extends Exception{
    WithdrawException(String msg){
        super(msg);
    }
    WithdrawException(){}
}

class Account{
    void withdraw(int amount, int balance) throws WithdrawException{
        if (amount > balance){
            System.out.println("Your Balance : " + balance);
            throw new WithdrawException("Insufficient balance");
        }
        else{
            System.out.println("Withdrawal successful. New balance: " + (balance - amount));
        }
    }
}

public class AccountExceptionDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.withdraw(1000, 500);
        }
        catch (WithdrawException e){
            System.err.println(e.getMessage());
        }
    }
}
