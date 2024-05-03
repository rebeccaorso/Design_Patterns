package chainOfResponsibility;

public class HelpDeskExample {
    public static void main(String[] args) {
        // Creazione dei gestori di assistenza
        AssistanceHandler level1Handler = new Level1AssistanceHandler();
        AssistanceHandler level2Handler = new Level2AssistanceHandler();
        AssistanceHandler level3Handler = new Level3AssistanceHandler();

        // Configurazione della catena di gestione delle richieste
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        // Simulazione di richieste di assistenza
        AssistanceRequest request1 = new AssistanceRequest("Problema di rete", 1);
        AssistanceRequest request2 = new AssistanceRequest("Problema software", 2);
        AssistanceRequest request3 = new AssistanceRequest("Problema hardware", 3);

        // Inoltro delle richieste alla catena di gestione
        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }
}
