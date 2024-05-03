package chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    //Questa classe simula un database che contiene nomi utente e password. È usata dai gestori per verificare le credenziali degli utenti. Metodi principali includono:
    private Map<String, String> users = new HashMap<>();

    public Database() {
        users.put("admin", "admin123");
        users.put("user", "user123");
    }

    public boolean userExists(String username) {
        return users.containsKey(username);
    }

    public boolean validPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
