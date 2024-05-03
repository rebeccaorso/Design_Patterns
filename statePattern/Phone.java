package statePattern;

//La classe Phone agisce come il contesto nel pattern di design State.
// Mantiene un riferimento allo stato corrente del telefono e delega le azioni dei pulsanti allo stato corrente
// attraverso i metodi pressPowerButton() e pressHomeButton().
//setState(State state): Permette di cambiare lo stato attuale del telefono.
//I metodi per gestire i pulsanti delegano l'azione allo stato corrente, che può a sua volta cambiare lo stato del telefono.
public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.pressPowerButton();
    }

    public void pressHomeButton() {
        state.pressHomeButton();
    }
}
