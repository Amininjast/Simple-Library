package ir.javaCup.model;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private boolean bookExistence;


    public Book() {
    }

    public Book(String bookName, String author) {
        setBookName(bookName);
        setAuthor(author);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isBookExistence() {
        return bookExistence;
    }

    public void setBookExistence(boolean bookExistence) {
        this.bookExistence = bookExistence;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookExistence=" + bookExistence +
                '}';
    }
}
