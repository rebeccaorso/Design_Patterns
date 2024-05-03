package decoratorPattern;

//ornisce un'interfaccia comune per tutte le notifiche, permettendo ai decorator di implementare la stessa interfaccia e quindi essere intercambiabili.
public interface INotifier {
    void send(String message);
}
