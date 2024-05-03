package chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler userExists = new UserExistsHandler(new Database());
        Handler validPassword = new ValidPasswordHandler(new Database());
        Handler roleCheck = new RoleCheckHandler();

        userExists.setNext(validPassword);
        validPassword.setNext(roleCheck);

        Request request = new Request("admin", "admin123", "admin");
        userExists.handle(request);
    }
}

// Il Chain of Responsibility è un pattern di progettazione comportamentale che consente di passare richieste
// tra una catena di oggetti fino a che uno di essi gestisce la richiesta. Questo pattern dà a più di un oggetto
// la possibilità di gestire una richiesta, creando una catena di oggetti riceventi per la richiesta.
// Questo pattern promuove l'idea di accoppiamento sciolto in cui nessun singolo oggetto gestisce una richiesta
// interamente da solo.