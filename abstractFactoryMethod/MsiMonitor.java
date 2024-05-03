package abstractFactoryMethod;

public class MsiMonitor implements Monitor{
    @Override
    public void displayMonitor() {
        System.out.println("MSI Monitor");
    }
}
