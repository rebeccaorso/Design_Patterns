package compositePattern;

// Rappresentano i nodi foglia dell'albero. Questi oggetti non hanno sottocomponenti. Il loro metodo getPrice() ritorna direttamente il prezzo del prodotto.
public class Book implements Component{
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
