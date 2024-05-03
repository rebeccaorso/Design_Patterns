package commandPattern;

public class Light {
    //Contiene la logica effettiva che gestisce l'attuazione delle operazioni
    // (come accendere/spegnere le luci). Il "receiver" sa come eseguire le operazioni.
    private boolean on;

    public void toggle() {
        on = !on;
        System.out.println("Light is now " + (on ? "on" : "off"));
    }
}
