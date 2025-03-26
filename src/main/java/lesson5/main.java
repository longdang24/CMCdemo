package lesson5;

public class main {
    public static void main(String[] args) {
        // Create a library with a capacity of 5 books
        Library library = new Library(3);

        // Add some books
        Book book1 = new Book("Java ", "XL", "111");
        Book book2 = new Book("python", "LO","212");

        library.addBook(book1);
        library.addBook(book2);

        // Display all books
        System.out.println("\nAll Books:");
        library.displayAllBooks();

//        // Borrow a book
//        System.out.println("\nBorrowing a book with ISBN 222:");
//        library.borrowBook("222");
//
//        // Attempt to borrow the same book again
//        System.out.println("\nBorrowing the same book again:");
//        library.borrowBook("222");
//
//        // Return the book
//        System.out.println("\nReturning the book:");
//        library.returnBook("222");
//
//        // Search for a book
//        System.out.println("\nSearching for a book by title 'Clean Code':");
//        library.searchBook("Clean Code");
//
//        // Remove a book
//        System.out.println("\nRemoving a book with ISBN 111:");
//        library.removeBook("111");
//
//        // Display all books after removal
//        System.out.println("\nAll Books After Removal:");
//        library.displayAllBooks();
    }
}
