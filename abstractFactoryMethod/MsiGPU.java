package abstractFactoryMethod;

public class MsiGPU implements GPU{

    //Classi Prodotti Concrete: Implementano le interfacce dei prodotti.
    @Override
    public void displayGPU() {
        System.out.println("MSI GPU");
    }
}
