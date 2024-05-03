package factoryMethod;

public class GraphicsDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new GraphicsDocument();
    }
}
