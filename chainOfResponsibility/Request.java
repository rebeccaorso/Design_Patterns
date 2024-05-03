package chainOfResponsibility;

public class Request {
    //Rappresenta una richiesta di autenticazione. Contiene tutti i dati necessari per l'autenticazione,
    // come nome utente, password e ruolo. Questi dati vengono passati ai vari handlers per essere verificati.
    private String username;
    private String password;
    private String role;

    public Request(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
