package chainOfResponsibility;

public class Level2AssistanceHandler extends BaseAssistanceHandler  {
    @Override
    public void handleRequest(AssistanceRequest request) {
        if (request.getLevel() <= 2) {
            System.out.println("Richiesta gestita dal livello 2 di supporto tecnico: " + request.getDescription());
        } else {
            passRequestToNext(request);
        }
    }
}
