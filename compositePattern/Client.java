package compositePattern;


//Crea un albero di componenti e calcola il prezzo totale di tutti gli oggetti all'interno della scatola principale. Dimostra la facilità di aggiungere nuovi componenti e sottocomponenti, mantenendo l'interazione semplice attraverso l'uso dell'interfaccia Component.
public class Client {
    public static void main(String[] args){
        Box mainBox = new Box(5.0);

        Book book1 = new Book(10.0);
        VideoGame game1 = new VideoGame(50.0);

        mainBox.addComponent(book1);
        mainBox.addComponent(game1);

        Box smallBox = new Box(2.0); // $2 packaging cost for the smaller box
        Book book2 = new Book(15.0);
        smallBox.addComponent(book2);

        mainBox.addComponent(smallBox);

        System.out.println("Total price of all items in the main box: $" + mainBox.getPrice());
    }
}

//Il Composite è un pattern di progettazione strutturale che consente di trattare singoli oggetti e composizioni
// di oggetti allo stesso modo. Questo pattern è particolarmente utile quando si lavora con strutture di dati
// che hanno una natura gerarchica, come un albero. Il Composite pattern consente di semplificare il codice rendendo
// le operazioni su singoli oggetti e gruppi di oggetti più uniformi. Questo pattern è spesso utilizzato
// per rappresentare gerarchie parte-tutto.