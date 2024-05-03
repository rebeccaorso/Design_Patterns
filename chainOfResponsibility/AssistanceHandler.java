package chainOfResponsibility;

public interface AssistanceHandler {
    void handleRequest(AssistanceRequest request);
    void setNextHandler(AssistanceHandler handler);
}
