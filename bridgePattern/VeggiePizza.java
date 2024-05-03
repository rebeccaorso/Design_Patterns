package bridgePattern;

//Implementazioni specifiche dell'interfaccia Pizza che dettagliano i passaggi per preparare, cuocere e servire tipi specifici di pizza.
public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza");

    }

    @Override
    public void serve() {
        System.out.println("Serving Veggie Pizza");
    }
}
