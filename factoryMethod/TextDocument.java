package factoryMethod;

public class TextDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening text document...");
    }
}
