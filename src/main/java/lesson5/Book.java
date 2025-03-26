package lesson5;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;


    public Book(String title, String author, String isbn) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this. isAvailable = true;
    }
    // method print displayBookDetail
    public void displayBookDetail() {
        System.out.println("title " + title);
        System.out.println("author "+ author);
        System.out.println("isnb "+ isbn);
        System.out.println("Isavailble "+ (isAvailable ? "yes" : "No"));
    }

    //method checkAvailability
    public boolean checkAvailability(){
        return  isAvailable;
    }

    //getter + setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Borrow book function
    public void  borrow(){
        if(isAvailable= false){
            System.out.println("the book is borrow " + title);
        }else {
            System.out.println("the book is available " + title);
        }
    }

    // Return book function
    public void returnBook(){
        isAvailable = true ;
        System.out.println(" The book is return " + title);
    }
}
