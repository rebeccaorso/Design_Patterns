package mediatorPattern;

//Sono componenti specifici dell'UI che notificano al mediatore quando l'utente interagisce con loro (clic o cambio di testo).
public class Button extends Component{
    public Button(DialogMediator mediator) {
        super(mediator);
    }

    public void click() {
        super.click();  // Notifies mediator about the click event
    }
}
