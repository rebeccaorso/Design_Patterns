package chainOfResponsibility;

public abstract class AbstractHandler implements Handler {

    //. Funge da base per tutti i concrete handlers,
    // fornendo l'implementazione di base del metodo setNext() e un template per il metodo handle().
    private Handler nextHandler; //Un campo privato che tiene traccia del prossimo handler nella catena.

    @Override
    public void setNext(Handler handler) { //Implementa il metodo per impostare il prossimo handler nella catena.
        this.nextHandler = handler;
    }

    @Override
    public boolean handle(Request request) { //Fornisce un'implementazione di base che semplicemente passa la richiesta al prossimo handler, se presente.
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return false;
    }
}
