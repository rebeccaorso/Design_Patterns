package factoryMethod;

public class BurgerPolloRistorante extends Ristorante {
    @Override
    protected Burger creaBurger(String tipo) {
        return new PolloBurger();
    }
}
