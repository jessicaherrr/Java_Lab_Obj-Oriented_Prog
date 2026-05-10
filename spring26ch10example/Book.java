package spring26ch10example;

public class Book extends Product {

    private String author;

    // default constructor
    public Book() {
        super(); //call parent default constructor
        author = "";
    }

    // constructor with parameters
    public Book(String code, String description, double price, String author) {
        super(code, description, price); // call parent constructor
        this.author = author;
    }

    // getter
    public String getAuthor() {
        return author;
    }

    // setter
    public void setAuthor(String au) {
        author = au;
    }

    // toString override
    @Override
    public String toString() {
        return super.toString() + "Author: " + author + "\n";
    }
}