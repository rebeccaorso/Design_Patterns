package mediatorPattern;

//Interfaccia del mediatore che fornisce il metodo notify per la comunicazione dei componenti.

public interface DialogMediator {
    void notify(Component sender, String event);
}
