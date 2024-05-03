package decoratorPattern;

public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Facebook message: " + message);
    }
}
