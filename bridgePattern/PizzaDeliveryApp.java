package bridgePattern;


//Dimostra come i clienti possono ordinare diversi tipi di pizza cucinati in diversi stili senza dover cambiare il codice della pizza o del ristorante. Gestisce le dipendenze tra le astrazioni e le loro implementazioni, decidendo a runtime quale combinazione di pizza e stile di ristorante utilizzare.
public class PizzaDeliveryApp {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PepperoniPizza();
        Pizza veggiePizza = new VeggiePizza();

        Restaurant americanRestaurant = new AmericanRestaurant();
        Restaurant italianRestaurant = new ItalianRestaurant();

        // Deliver pepperoni pizza in American style
        americanRestaurant.cook(pepperoniPizza);

        // Deliver veggie pizza in Italian style
        italianRestaurant.cook(veggiePizza);
    }
}

//il Bridge Pattern può essere utilizzato per separare le dimensioni di variazione in un'applicazione, permettendo a ciascuna di evolvere indipendentemente dall'altra, riducendo la complessità e migliorando la manutenibilità del codice.