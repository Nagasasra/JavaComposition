package ExerciseonComposition2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
        this.id = customer.getID();
    }
    public Account(Customer customer) {
        this.customer = customer;
        this.id = customer.getID();
    }
    public int getID() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getCustomer().toString() + " balance=$" + getBalance();
    }
    public String getCustomerName() {
        return getCustomer().getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
