package flyweightPattern;

public class Client {
    public static void main(String[] args) {
        // Crea tipi di libro utilizzando la factory
        BookType fantasyType = BookTypeFactory.getBookType("Fantasy", "Generic Publishers", "Fantasy Data");
        BookType actionType = BookTypeFactory.getBookType("Action", "Action Heroes Co.", "Action Data");

        // Crea libri
        Book book1 = new Book("The Chronicles of Narnia", "C.S. Lewis", fantasyType);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", fantasyType);
        Book book3 = new Book("Mission Impossible", "Author X", actionType);

        // Visualizza le informazioni sui libri
        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();

        // Mostra che i tipi di libro sono condivisi
        System.out.println("Checking if book1 and book2 share the same BookType object: " +
                (book1.getBookType() == book2.getBookType())); // Dovrebbe restituire true
        System.out.println("Checking if book2 and book3 share the same BookType object: " +
                (book2.getBookType() == book3.getBookType())); // Dovrebbe restituire false
    }
}


//L'uso di BookTypeFactory assicura che se un BookType con gli stessi parametri viene richiesto più volte, viene restituito lo stesso oggetto, riducendo così l'uso della memoria e migliorando le prestazioni complessive dell'applicazione.