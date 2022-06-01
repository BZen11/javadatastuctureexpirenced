package practiceBlake;

public class Book {

    private String bookName;
    private String authorName;
    private int id;

    public Book(String bookName, String authorName, int id) {
        super();
        this.bookName = bookName;
        this.authorName = authorName;
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName + ", Author Name: " + authorName + ", ID: " + id;
    }
}
