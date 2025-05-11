package assign1.code29;



/*
Create a method to simulate a simple library system: borrow, return, and view book
availability

 */
import java.util.Scanner;

public class Main {

    // Book titles
    static String[] books = {
        "Java Basics", 
        "Data Structures", 
        "Algorithms", 
        "Operating Systems", 
        "Database Systems"
    };

    // true = available, false = borrowed
    static boolean[] isAvailable = {true, true, true, true, true};

    // Method to display all books and availability
    public static void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < books.length; i++) {
            String status = isAvailable[i] ? "Available" : "Borrowed";
            System.out.println((i + 1) + ". " + books[i] + " - " + status);
        }
    }

    // Method to borrow a book
    public static void borrowBook(int bookIndex) {
        if (bookIndex < 0 || bookIndex >= books.length) {
            System.out.println("Invalid book number.");
            return;
        }
        if (isAvailable[bookIndex]) {
            isAvailable[bookIndex] = false;
            System.out.println("You borrowed: " + books[bookIndex]);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    // Method to return a book
    public static void returnBook(int bookIndex) {
        if (bookIndex < 0 || bookIndex >= books.length) {
            System.out.println("Invalid book number.");
            return;
        }
        if (!isAvailable[bookIndex]) {
            isAvailable[bookIndex] = true;
            System.out.println("You returned: " + books[bookIndex]);
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }

    // Main menu loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. View Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    viewBooks();
                    System.out.print("Enter book number to borrow: ");
                    int borrowIndex = scanner.nextInt() - 1;
                    borrowBook(borrowIndex);
                    break;
                case 3:
                    viewBooks();
                    System.out.print("Enter book number to return: ");
                    int returnIndex = scanner.nextInt() - 1;
                    returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
        
        scanner.close();
    }
}
