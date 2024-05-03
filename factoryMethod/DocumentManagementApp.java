package factoryMethod;

public class DocumentManagementApp {
    public static void main(String[] args) {
        // Creazione di documenti di testo
        DocumentCreator textCreator = new TextDocumentCreator();
        textCreator.useDocument();

        // Creazione di documenti grafici
        DocumentCreator graphicsCreator = new GraphicsDocumentCreator();
        graphicsCreator.useDocument();

        // Creazione di presentazioni
        DocumentCreator presentationCreator = new PresentationDocumentCreator();
        presentationCreator.useDocument();
    }

}
