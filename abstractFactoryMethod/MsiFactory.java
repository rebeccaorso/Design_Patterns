package abstractFactoryMethod;

public class MsiFactory implements ComputerFactory{

    //Concrete Factories: Implementano l'interfaccia della factory astratta per produrre prodotti specifici di una particolare famiglia.
    @Override
    public GPU createGPU() {
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
