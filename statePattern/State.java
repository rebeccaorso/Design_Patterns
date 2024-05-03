package statePattern;

//La classe State è una classe astratta che definisce la struttura di base per i vari stati del telefono.
// Contiene due metodi astratti, pressPowerButton() e pressHomeButton(), che devono essere implementati da ogni stato concreto.
// Inoltre, mantiene un riferimento all'oggetto Phone, permettendo alle sottoclassi di modificare lo stato del telefono.
public abstract class State {
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract void pressPowerButton();
    public abstract void pressHomeButton();
}
