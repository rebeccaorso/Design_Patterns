package facadePattern;

//Gestisce le transazioni di criptovaluta, eseguendo acquisti e altre operazioni finanziarie.
public class CryptoService {
    public Transaction performTransaction(User user, double amount, String currency) {

        System.out.println("Transaction performed for " + amount + " " + currency);
        return new Transaction(user, amount, currency);
    }
}
