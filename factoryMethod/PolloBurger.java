package factoryMethod;

public class PolloBurger implements Burger {
    @Override
    public void prepara() {
        System.out.println("Preparazione PolloBurger.");
    }

    @Override
    public void cucina() {
        System.out.println("Cucina PolloBurger.");
    }

    @Override
    public void servi() {
        System.out.println("Servizio PolloBurger.");
    }
}
