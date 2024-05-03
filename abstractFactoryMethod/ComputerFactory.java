package abstractFactoryMethod;

public interface ComputerFactory {
    //Abstract Factory: Fornisce un'interfaccia per la creazione di famiglie di prodotti correlati.
    GPU createGPU();
    Monitor createMonitor();
}
