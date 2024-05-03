package statePattern;

//La classe LockedState estende State e gestisce il comportamento del telefono quando è bloccato.
//pressPowerButton(): Spegne il telefono, cambiando il suo stato a OffState.
//pressHomeButton(): Sblocca il telefono e lo porta allo stato di ReadyState, pronto per l'uso.
public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Turning off the phone.");
        phone.setState(new OffState(phone));
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Unlocking the phone, ready to use.");
        phone.setState(new ReadyState(phone));

    }
}
