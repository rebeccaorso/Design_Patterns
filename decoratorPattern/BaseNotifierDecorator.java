package decoratorPattern;

//Mantiene un riferimento a un oggetto INotifier, fornendo un'opportunità per le classi figlie (decoratori concreti) di estendere il comportamento di send.
public abstract class BaseNotifierDecorator implements INotifier{
    protected INotifier wrappee;

    public BaseNotifierDecorator(INotifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
