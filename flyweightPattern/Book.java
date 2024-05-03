package flyweightPattern;

// Rappresenta il contesto in cui viene utilizzato il flyweight. Contiene lo stato esterno che è unico per ogni libro e fa riferimento all'oggetto BookType.
public class Book {

    private final String title;
    private final String author;
    private final BookType bookType;

    public Book(String title, String author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
    }

    public void displayBookInfo(){
        System.out.println("Book: " + title + " by " + author +
                ", Type: " + bookType.getType() +
                ", Distributor: " + bookType.getDistributor());
    }

    public BookType getBookType() {
        return bookType;
    }
}
