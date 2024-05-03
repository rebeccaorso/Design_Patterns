package chainOfResponsibility;

public class RoleCheckHandler extends AbstractHandler{
    @Override
    public boolean handle(Request request) {
        if ("admin".equals(request.getRole())) {
            System.out.println("Hello, admin.");
            return true;
        }
        System.out.println("Hello, user.");
        return super.handle(request);
    }
}
