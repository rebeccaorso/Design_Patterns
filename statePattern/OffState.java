package statePattern;

//La classe OffState estende State e rappresenta lo stato in cui il telefono è spento.
//pressPowerButton: Accende il telefono e cambia il suo stato a LockedState, indicando che il telefono è acceso ma bloccato.
//pressHomeButton(): Non ha effetto perché il telefono è spento.
public class OffState extends State{
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Turning on the phone, it's now locked.");
        phone.setState(new LockedState(phone));
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Nothing happens because the phone is off.");
    }
}
