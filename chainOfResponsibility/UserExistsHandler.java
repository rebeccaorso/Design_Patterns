package chainOfResponsibility;

public class UserExistsHandler extends AbstractHandler{

    //Queste classi estendono AbstractHandler e implementano la logica specifica per gestire aspetti diversi dell'autenticazione.
    // Ogni classe è responsabile per un singolo tipo di verifica
    private Database database;
    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(Request request) {
        if (!database.userExists(request.getUsername())) {
            System.out.println("User does not exist.");
            return false;
        }
        System.out.println("User exists.");
        return super.handle(request);
    }

}
