package statePattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.process();
        order.ship();
        order.deliver();
    }
}
