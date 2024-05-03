package chainOfResponsibility;

public abstract class BaseAssistanceHandler implements AssistanceHandler {
    private AssistanceHandler nextHandler;

    @Override
    public void setNextHandler(AssistanceHandler handler) {
        this.nextHandler = handler;
    }

    protected void passRequestToNext(AssistanceRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}
