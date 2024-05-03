package bridgePattern;

public class AmericanRestaurant implements Restaurant {
    @Override
    public void cook(Pizza pizza) {
        System.out.println("Cooking in American style");
        pizza.prepare();
        pizza.bake();
        pizza.serve();
    }
}
