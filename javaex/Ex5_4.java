import java.util.Scanner;

class Book {
    protected String bookTitle;
    protected String bookAuthor;
    protected int bookNoOfCopies;
    protected int bookAvailability;
    protected String bookEdition;
    protected String bookPublisher;

    // Constructor
    public Book(String title, String author, int noOfCopies, String edition, String publisher) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookNoOfCopies = noOfCopies;
        this.bookAvailability = noOfCopies; // Initially, all copies are available
        this.bookEdition = edition;
        this.bookPublisher = publisher;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Number of Copies: " + bookNoOfCopies);
        System.out.println("Available Copies: " + bookAvailability);
        System.out.println("Edition: " + bookEdition);
        System.out.println("Publisher: " + bookPublisher);
    }

    // Method to borrow a book
    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies to borrow: ");
        int copiesToBorrow = scanner.nextInt();

        if (copiesToBorrow > 0 && copiesToBorrow <= bookAvailability) {
            bookAvailability -= copiesToBorrow;
            System.out.println(copiesToBorrow + " copies of '" + bookTitle + "' borrowed successfully.");
        } else {
            System.out.println("Invalid number of copies. Borrowing failed.");
        }
    }

    // Method to return a book
    public void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies to return: ");
        int copiesToReturn = scanner.nextInt();

        if (copiesToReturn > 0) {
            bookAvailability += copiesToReturn;
            System.out.println(copiesToReturn + " copies of '" + bookTitle + "' returned successfully.");
        } else {
            System.out.println("Invalid number of copies. Returning failed.");
        }
    }
}

class LibraryBook extends Book {
    private String genre;

    // Constructor for LibraryBook
    public LibraryBook(String title, String author, int noOfCopies, String edition, String publisher, String genre) {
        super(title, author, noOfCopies, edition, publisher);
        this.genre = genre;
    }

    // Method to display book details (overriding the method in the parent class)
    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Call the displayBookDetails method in the parent class
        System.out.println("Genre: " + genre);
    }
}

public class Ex5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LibraryBook object
        LibraryBook book1 = new LibraryBook("Java Programming", "John Doe", 5, "2nd Edition", "Tech Publications", "Programming");

        // Menu-driven application
        while (true) {
            System.out.println("\nLibrary Management Menu:");
            System.out.println("1. Display Book Details");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book1.displayBookDetails();
                    break;
                case 2:
                    book1.borrowBook();
                    break;
                case 3:
                    book1.returnBook();
                    break;
                case 4:
                    System.out.println("Exiting Library Management. Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
