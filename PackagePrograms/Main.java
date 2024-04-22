package PackagePrograms;

class Book {
    // Public attributes
    public String title;
    public String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Public method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Book class
        Book myBook = new Book("Java Programming", "John Doe");

        // Accessing public attributes
        System.out.println("Book Title: " + myBook.title);
        System.out.println("Book Author: " + myBook.author);
        System.out.println();
        // Accessing public method
        System.out.println("THe details using display details method:");
        myBook.displayDetails();
    }
}
