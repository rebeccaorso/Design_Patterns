package decoratorPattern;

//Implementa il comportamento di base dell'invio delle notifiche. Nel nostro caso, è responsabile per l'invio di notifiche via email.
public class Notifier implements INotifier{
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
