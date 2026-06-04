package Constructor;

public class Customer {
    int custId;
    String custName;
    String custAddress;

    Customer(int custId, String custName, String custAddress){
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    void display(){
        System.out.println(
                "Customer Id: " + custId + "\n" +
                "Customer Name: " + custName + "\n" +
                "Customer Address: " + custAddress
        );
    }
}

class Account1{
    int accId;
    String accType;
    Customer customer;
    int acctBalance;

    Account1(int accId, String accType, Customer customer, int acctBalance){
        this.accId = accId;
        this.accType = accType;
        this.customer = customer;
        this.acctBalance = acctBalance;
    }

    void display(){
        System.out.println(
                "Account Id: " + accId + "\n" +
                "Account Type: " + accType + "\n" +
                "Account Balance: " + acctBalance
        );
        customer.display();
    }
}

class AccountTest{
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Shreyash", "Amravati");
        Account1 account1 = new Account1(101, "Saving", customer1, 100000);
        account1.display();

        System.out.println();

        Customer customer2 = new Customer(2, "Pratik", "Anjangaon Bari");
        Account1 account2 = new Account1(102, "Current", customer2, 50000);
        account2.display();
    }
}
