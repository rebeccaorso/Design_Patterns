package factoryMethod;

public class PresentationDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PresentationDocument();
    }
}
