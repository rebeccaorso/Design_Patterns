package compositePattern;

//Definisce l'interfaccia comune per gli oggetti nell'albero. Nel nostro caso, il metodo getPrice() calcola il prezzo di un componente, sia esso un prodotto singolo o una scatola di prodotti.
public interface Component {
    double getPrice();
}
