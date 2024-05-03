package singleton;

public class Singleton {
    private static Singleton instance; // Definizione della variabile statica che conterrà l'unica istanza della classe singleton.Singleton
    private String data; // Definizione della variabile per memorizzare i dati da utilizzare nell'istanza

    private Singleton(String data) {  // Definizione del costruttore privato per impedire la creazione di istanze esterne
        this.data = data; // Inizializzazione della variabile di istanza con il dato fornito
    }

    // Metodo per ottenere l'unica istanza della classe singleton.Singleton
    // Accetta come argomento il dato da utilizzare nell'istanza
    public static Singleton getInstance(String data) {
        if (instance == null) { // Verifica se l'istanza è nulla (non è stata ancora creata)
            synchronized (Singleton.class) { // Blocco synchronized per gestire l'accesso concorrente da parte di più thread
                if (instance == null) { // Doppia verifica per garantire la sicurezza in caso di accesso concorrente
                    instance = new Singleton(data); // Creazione dell'istanza singleton.Singleton con il dato fornito
                }
            }
        }
        return instance; // Restituisce l'unica istanza della classe singleton.Singleton
    }
}

//Istanza unica: Il Singleton garantisce che una classe abbia solo una singola istanza. Questo viene solitamente realizzato rendendo il costruttore della classe privato, in modo che nessun altro codice possa creare un'istanza della classe.
//Accesso globale: Il Singleton fornisce un metodo statico che restituisce l'istanza della classe. Questo metodo viene chiamato getInstance nella maggior parte delle implementazioni. Quando getInstance viene chiamato per la prima volta, crea un'istanza della classe. Nelle chiamate successive, restituisce l'istanza creata in precedenza.
//Thread-safe: Un Singleton dovrebbe essere “thread-safe”, cioè dovrebbe funzionare correttamente anche in un ambiente multithread. Questo viene solitamente realizzato con l'uso di meccanismi di sincronizzazione.
