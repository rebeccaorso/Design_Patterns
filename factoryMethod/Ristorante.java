package factoryMethod;
//Si definisce una classe astratta che dichiara il metodo factory astratto. Questo metodo è responsabile
// per restituire un'istanza del prodotto. La classe creatrice può anche fornire un'implementazione
// di default del metodo factory che restituisce un tipo di prodotto predefinito.

public abstract class Ristorante {

    protected abstract Burger creaBurger(String tipo);

    public Burger ordinaBurger(String tipo) {
        Burger burger = creaBurger(tipo);
        burger.prepara();
        burger.cucina();
        burger.servi();
        return burger;
    }
}
