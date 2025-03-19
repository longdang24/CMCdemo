package lesson5;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private  boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public void getDetail (){
        System.out.println(" display detail" + title + author + isbn);
    }


    public void getAvailable (){
        if (isAvailable = false ){
            System.out.println("The book is not here");
        }else {
            System.out.println("the book is here");
        }
    }






}

