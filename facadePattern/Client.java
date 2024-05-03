package facadePattern;

public class Client {
    public static void main(String[] args) {
        // Creazione dei servizi che saranno utilizzati dalla facade
        AccountService accountService = new AccountService();
        CryptoService cryptoService = new CryptoService();
        NotificationService notificationService = new NotificationService();

        // Creazione della facade
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade(accountService, cryptoService, notificationService);

        // Dati di esempio per simulare l'acquisto
        String userId = "user123";
        double amount = 100.0;  // Importo che l'utente vuole investire
        String currency = "Bitcoin";  // La criptovaluta che l'utente vuole acquistare

        // Utilizzo della facade per eseguire l'acquisto
        buyCryptoFacade.buyCrypto(userId, amount, currency);
    }
}

//Questo esempio dimostra come il Façade Pattern possa essere utilizzato per semplificare l'interazione
// con un sistema complesso, riducendo la complessità percepita dall'utente finale e migliorando la manutenibilità
// del sistema isolando la logica di business dalle implementazioni specifiche dei sottosistemi.