package ExerciseonComposition2_5;

public class TestAccount {
    public static void main(String[] args) {

        // creating a customer
        Customer c1 = new Customer(48331, "Ben", 'm');
        // testing getters for customer
        System.out.println("ID: " + c1.getID());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
        System.out.println(c1); // tostring for customer

        // creating an account with no money argument
        Account a1 = new Account(c1);
        // testing setter and getters for the account
        a1.setBalance(6);
        System.out.println("Balance=$" + a1.getBalance());
        System.out.println("Customer name: " + a1.getCustomerName());
        // getting customer attributes through account
        System.out.println("Customer ID: " + a1.getCustomer().getID());
        System.out.println("Customer gender: " + a1.getCustomer().getGender());

        // depositing and withdrawing
        System.out.println(a1.withdraw(3));
        System.out.println(a1.deposit(5));
        System.out.println(a1);

        // creating an account with money argument
        Customer c2 = new Customer(56278, "Bob", 'm');
        Account a2 = new Account(c2,30);
        System.out.println("Customer name: " + a2.getCustomerName());
        System.out.println("Customer ID: " + a2.getID());
        System.out.println(a2);
    }
}
