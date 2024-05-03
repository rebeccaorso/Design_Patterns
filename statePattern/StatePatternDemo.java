package statePattern;

//Questa classe dimostra come utilizzare il pattern State con l'oggetto Phone, simulando diverse interazioni
// con i pulsanti e osservando i cambiamenti di stato.
public class StatePatternDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.pressHomeButton(); // Non fa nulla perché il telefono è spento
        phone.pressPowerButton(); // Accende il telefono e passa allo stato bloccato
        phone.pressHomeButton(); // Sblocca il telefono
        phone.pressPowerButton(); // Spegne il telefono
    }
}
