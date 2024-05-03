package statePattern;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new ProcessingState(); // Imposta lo stato iniziale a "In elaborazione"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.process(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void deliver() {
        state.deliver(this);
    }
}
