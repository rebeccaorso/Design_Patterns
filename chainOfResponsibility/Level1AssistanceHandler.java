package chainOfResponsibility;

public class Level1AssistanceHandler extends BaseAssistanceHandler {
    @Override
    public void handleRequest(AssistanceRequest request) {
        if (request.getLevel() <= 1) {
            System.out.println("Richiesta gestita dal livello 1 di supporto tecnico: " + request.getDescription());
        } else {
            passRequestToNext(request);
        }
    }

}
