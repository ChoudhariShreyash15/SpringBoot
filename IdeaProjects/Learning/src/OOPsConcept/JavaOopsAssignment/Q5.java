package OOPsConcept.JavaOopsAssignment;

public class Q5 {
    int custId;
    String custName;
    String custAddress;

    Q5(int custId, String custName, String custAddress){
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    Q5() {}

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
    Q5 customer;
    int acctBalance;

    Account1(int accId, String accType, Q5 customer, int acctBalance){
        this.accId = accId;
        this.accType = accType;
        this.customer = customer;
        this.acctBalance = acctBalance;
    }

    Account1() {}

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
        Q5 customer1 = new Q5(1, "Shreyash", "Amravati");
        Account1 account1 = new Account1(101, "Saving", customer1, 100000);
        account1.display();

        System.out.println();

        Q5 customer2 = new Q5(2, "Pratik", "Anjangaon Bari");
        Account1 account2 = new Account1(102, "Current", customer2, 50000);
        account2.display();

        System.out.println();

        Q5 customer3 = new Q5();
        Account1 account3 = new Account1(103, "Current", customer3, 50000);
        account3.display();
    }
}
