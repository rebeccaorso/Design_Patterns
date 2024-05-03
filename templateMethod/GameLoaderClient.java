package templateMethod;

public class GameLoaderClient {
    // Codice che dimostra come utilizzare le classi loader. Il client crea un'istanza di WorldOfWarcraftLoader
    // DiabloLoader e chiama loadGame() per eseguire il processo di caricamento completo definito dalla template method.

    public static void main(String[] args) {
        BaseGameLoader loader = new WorldOfWarcraftLoader();
        loader.loadGame();

        System.out.println("Switching to another game load...");

        loader = new DiabloLoader();
        loader.loadGame();
    }
}

// Il Template Method è un pattern di progettazione che permette alle sottoclassi di ridefinire alcuni passaggi
// di un algoritmo senza cambiare la struttura dell'algoritmo. Il Template Method è uno dei pattern di progettazione
// più facili da capire e implementare. Questo pattern viene utilizzato popolarmente nello sviluppo di framework.
// Questo aiuta anche a evitare la duplicazione del codice.