package factoryMethod;

public class GraphicsDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening graphics document...");
    }
}
