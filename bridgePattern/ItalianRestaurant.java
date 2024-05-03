package bridgePattern;

//Implementazioni specifiche che dettagliano come un ristorante cucina una pizza, incorporando lo stile culinario specifico (americano o italiano).
public class ItalianRestaurant implements Restaurant {
    @Override
    public void cook(Pizza pizza) {
        System.out.println("Cooking in Italian style");
        pizza.prepare();
        pizza.bake();
        pizza.serve();
    }
}
