package abstractFactoryMethod;

public class AsusFactory implements ComputerFactory{
    @Override
    public GPU createGPU() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
