package statePattern;

public interface OrderState {
    void process(Order order);
    void ship(Order order);
    void deliver(Order order);
}
