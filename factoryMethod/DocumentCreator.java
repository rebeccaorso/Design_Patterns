package factoryMethod;

public abstract class DocumentCreator {

    public abstract Document createDocument();



    public void useDocument() {
        Document doc = createDocument();
        doc.open();
    }
}
