package commandPattern;

public interface Command {
    //Definisce l'operazione execute() che ogni comando concreto dovrà implementare. Questo metodo incapsula l'azione e i suoi parametri.
    void execute();
}
