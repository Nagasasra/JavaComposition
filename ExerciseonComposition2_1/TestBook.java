package ExerciseonComposition2_1;

public class TestBook {
    public static void main(String[] args) {

        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name: " + dummyBook.getName());
        System.out.println("price: " + dummyBook.getPrice());
        System.out.println("qty: " + dummyBook.getQty());
        System.out.println("Author: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name: " + dummyBook.getAuthorName());
        System.out.println("Author's email: " + dummyBook.getAuthorEmail());
        System.out.println("Author's gender: " + dummyBook.getAuthorGender());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()

        // Printing the name and email of the author from a Book instance
        Author f = new Author("Frank the Wise","frankthewise@somewhere.com", 'm');
        Book randomBook = new Book("Java Tutorial", f, 'm');
        System.out.println("Author's name: " + randomBook.getAuthor().getName());
        System.out.println("Author's email: " + randomBook.getAuthor().getEmail());
    }
}
