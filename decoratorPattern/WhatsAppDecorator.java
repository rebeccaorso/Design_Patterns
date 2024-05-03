package decoratorPattern;

//Estendono il comportamento di invio delle notifiche aggiungendo funzionalità per inviare notifiche attraverso canali specifici (WhatsApp e Facebook) oltre all'email.
public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending WhatsApp message: " + message);
    }
}
