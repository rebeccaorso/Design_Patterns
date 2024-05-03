package factoryMethod;

public class BurgerVegetarianoRistorante extends Ristorante {
    //Le sottoclassi della classe creatrice sovrascrivono il metodo factory per creare e restituire istanze
    // dei prodotti concreti. Questo passo permette di variare il tipo di prodotto creato senza modificare
    // il codice cliente che utilizza la classe creatrice.
    @Override
    protected Burger creaBurger(String tipo) {
        return new BurgerVegetariano();
    }
}
