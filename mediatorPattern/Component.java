package mediatorPattern;

//Classe astratta base per tutti i componenti UI che necessitano di interagire con il mediatore.
public abstract class Component {
    protected DialogMediator mediator;

    public Component(DialogMediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.notify(this, "click");
    }
    public void change() {
        mediator.notify(this, "change");
    }
}
