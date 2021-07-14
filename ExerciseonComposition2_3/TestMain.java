package ExerciseonComposition2_3;

public class TestMain {
    public static void main(String[] args) {
        // Test Author class
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1); // tostring

        a1.setEmail("ahteck@somewhere.com");
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // Test Book class with qty argument
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn: " + b1.getIsbn());
        System.out.println("name: " + b1.getName());
        System.out.println("price: " + b1.getPrice());
        System.out.println("qty: " + b1.getQty());
        System.out.println("author: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());

        // test Book class without qty argument
        Book b2 = new Book("98765", "Java for Experts", a1, 16.6);
        System.out.println(b2);
    }
}
