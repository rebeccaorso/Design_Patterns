package statePattern;

//La classe ReadyState estende State e definisce il comportamento del telefono quando è sbloccato e pronto per l'uso.
//pressPowerButton(): Spegne il telefono, ritornando allo stato OffState.
//pressHomeButton(): Simula il ritorno alla schermata home. In questa implementazione, non cambia lo stato del telefono,
// ma potrebbe essere utilizzato per implementare ulteriori funzionalità.
public class ReadyState extends State{
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Turning off the phone.");
        phone.setState(new OffState(phone));
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Going to the home screen.");
    }
}
