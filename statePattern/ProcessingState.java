package statePattern;

public class ProcessingState implements OrderState {
    @Override
    public void process(Order order) {
        System.out.println("Order is already being processed.");

    }

    @Override
    public void ship(Order order) {

    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot ship order. Process the order first.");
        System.out.println("Cannot deliver order. Ship the order first.");

    }
}
