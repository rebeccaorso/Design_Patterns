package chainOfResponsibility;

public class ValidPasswordHandler extends AbstractHandler {
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(Request request) {
        if (!database.validPassword(request.getUsername(), request.getPassword())) {
            System.out.println("Invalid password.");
            return false;
        }
        System.out.println("Password valid.");
        return super.handle(request);
    }
}
