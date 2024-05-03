package factoryMethod;

public class TextDocumentCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
