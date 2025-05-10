package entity;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private boolean isIssued;
    private double rating;

    public Book(String bookId, String title, String author, double rating) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.isIssued = false;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getRating() {
        return rating;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    @Override
    public String toString() {
        return "[" + bookId + "] " + title + " by " + author + " rated " + rating + (isIssued ? " (Issued)" : " (Available)");
    }
    
}
