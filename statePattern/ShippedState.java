package statePattern;

public class ShippedState implements OrderState{
    @Override
    public void process(Order order) {
        System.out.println("Cannot process order. Order is already shipped.");

    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship order. Order is already shipped.");

    }

    @Override
    public void deliver(Order order) {
        System.out.println("Delivering order...");
        order.setState(new DeliveredState());
    }
}
