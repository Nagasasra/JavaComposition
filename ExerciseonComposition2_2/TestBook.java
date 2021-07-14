package ExerciseonComposition2_2;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {

        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // getters and setters for Authors
        authors[0].setEmail("TheRealAhTeck@somewhere.com");
        System.out.println(authors[0].getEmail());
        System.out.println(authors[0].getGender());


        // Testing the book class methods without qty
        Book b = new Book("Java for Noobs", authors, 39.99);
        // Testing setters
        b.setPrice(49.99);
        b.setQty(2);
        // testing getters
        System.out.println("The name is: " + b.getName());
        System.out.println(Arrays.toString(b.getAuthors()));
        System.out.println("The authors are: " + b.getAuthorNames());
        System.out.println("The price is: $" + b.getPrice());
        System.out.println("The quantity is: " + b.getQty());

        // Testing the book class methods with qty argument
        Book bb = new Book("Java Exercise", authors, 59.99, 2);
        // Testing tostring
        System.out.println(bb.toString());
    }
}
