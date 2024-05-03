package statePattern;

public class DeliveredState implements OrderState {
    @Override
    public void process(Order order) {
        System.out.println("Cannot process order. Order is already delivered.");

    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship order. Order is already delivered.");

    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver order. Order is already delivered.");

    }
}
