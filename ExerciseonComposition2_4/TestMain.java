package ExerciseonComposition2_4;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);  // Customer's toString()

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id : " + c1.getID());
        System.out.println("name: " + c1.getName());
        System.out.println("discount: " + c1.getDiscount());

        // Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id: " + inv1.getID());
        System.out.println("customer: " + inv1.getCustomer());  // Customer's toString()
        System.out.println("amount: " + inv1.getAmount());
        System.out.println("customer's id: " + inv1.getCustomerID());
        System.out.println("customer's name: " + inv1.getCustomerName());
        System.out.println("customer's discount: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount: %.2f%n", inv1.getAmountAfterDiscount());
    }
}
