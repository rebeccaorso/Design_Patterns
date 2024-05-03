package bridgePattern;

//Definisce un'interfaccia per i diversi stili di ristoranti che possono cucinare le pizze, con un metodo cook che accetta un oggetto Pizza.
public interface Restaurant {
    void cook(Pizza pizza);
}
