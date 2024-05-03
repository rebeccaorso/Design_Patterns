package factoryMethod;


public class PresentationDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening presentation document...");
    }
}
