package facadePattern;

// Gestisce le operazioni legate agli account degli utenti, come il recupero dei dettagli dell'utente e la verifica del saldo.
public class AccountService {
    public User getUserDetails(String userId){
        return new User(userId, "user@example.com");
    }

    public boolean checkBalance(User user, double amount) {
        return true; // Assume the user always has enough balance
    }
}
