package chainOfResponsibility;

public class Level3AssistanceHandler extends BaseAssistanceHandler {
    @Override
    public void handleRequest(AssistanceRequest request) {
        if (request.getLevel() <= 3) {
            System.out.println("Richiesta gestita dal livello 3 di supporto tecnico: " + request.getDescription());
        } else {
            passRequestToNext(request);
        }
    }
}
