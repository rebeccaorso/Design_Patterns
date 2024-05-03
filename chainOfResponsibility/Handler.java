package chainOfResponsibility;

public interface Handler {

    //Definisce il contratto per i gestori (handlers) che processeranno le richieste.

  //Questo metodo permette di collegare un altro handler nella catena. Ogni handler sa chi è il successivo
  // a cui passare la richiesta, se non è in grado di gestirla completamente.
    void setNext(Handler handler);

    // Questo metodo prende in ingresso una richiesta e ritorna un booleano. Il metodo gestisce
    // la richiesta e decide se passarla al prossimo handler nella catena o terminare il processo.
    boolean handle(Request request);
}
