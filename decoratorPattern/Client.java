package decoratorPattern;

//Crea oggetti notifier e li avvolge con diversi decoratori per aggiungere funzionalità.
// Il client può configurare dinamicamente la catena di decoratori per inviare notifiche attraverso vari canali
// senza modificare il codice originale o l'implementazione esistente.
public class Client {
    public static void main(String[] args) {
        INotifier simpleNotifier = new Notifier();
        INotifier whatsappNotifier = new WhatsAppDecorator(simpleNotifier);
        INotifier facebookWhatsappNotifier = new FacebookDecorator(whatsappNotifier);

        facebookWhatsappNotifier.send("Your order has been delivered!");
    }
}

//l Decorator Pattern possa essere utilizzato per estendere le funzionalità di un oggetto in modo trasparente e flessibile,
// permettendo di aggiungere nuove funzionalità dinamicamente mantenendo il codice pulito e rispettando
// i principi di responsabilità singola e apertura/chiusura.
//Il Decorator è un pattern di progettazione strutturale che consente di aggiungere dinamicamente nuove funzionalità
// a un oggetto senza modificare la sua implementazione. Questo pattern crea un'alternativa flessibile all'ereditarietà
// estendendo le funzionalità di un oggetto a runtime. Il Decorator pattern è utile quando si desidera modificare
// il comportamento di un oggetto senza influenzare gli altri oggetti della stessa classe. Inoltre, questo pattern
// può essere utilizzato per aggiungere o rimuovere responsabilità da un oggetto dinamicamente.