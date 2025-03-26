package lesson5;

public class Library {
    private Book[] books;
    private int bookCount = 0;

    //contructor
    public
    Library(int capacity){
        books = new Book[capacity];
    }

    // add a new book (method)
    public void addBook(Book book){
        if (bookCount < books.length){
            books[bookCount] = book ;
            bookCount++;
            System.out.println("Book added: " + book.getTitle());
        }else {
            System.out.println("Libraly is full ");
        }
    }
// remove book
    public void removeBook(String isbn){
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getIsbn().equals(isbn))
            {
                System.out.println("Removing book: " + books[i].getTitle());
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
    }
    // search boook
    public void searchBook(String keyword) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(keyword) ||
                    books[i].getAuthor().equalsIgnoreCase(keyword)) {
                books[i].displayBookDetail();
                found = true;

}if (!found) {
                System.out.println("No books found with title/author: " + keyword);
            }
        }
    }
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookDetail();
                System.out.println("-----------------------");
            }
        }
    }

    // Borrow a book
    public void borrowBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].borrow();
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Return a book
    public void returnBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}
