package facadePattern;

//Rappresentano rispettivamente gli utenti del sistema e le transazioni effettuate.
public class User {
    private String id;
    private String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
