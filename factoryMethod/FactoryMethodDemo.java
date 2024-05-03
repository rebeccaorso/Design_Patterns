package factoryMethod;

//Il codice cliente crea un'istanza di una specifica sottoclasse della classe creatrice e usa il suo
// metodo factory per ottenere nuovi oggetti prodotto. Il cliente interagisce con i prodotti attraverso
// l'interfaccia comune, quindi non ha bisogno di conoscere le classi di prodotto concrete.
public class FactoryMethodDemo {

    public static void main(String[] args) {
        Ristorante burgerVegetarianoRistorante = new BurgerVegetarianoRistorante();
        Ristorante polloBurgerRistorante = new BurgerPolloRistorante();

        Burger burgerVegetariano = burgerVegetarianoRistorante.ordinaBurger("vegetariano");
        Burger polloBurger = polloBurgerRistorante.ordinaBurger("pollo");
    }
}

//è un design pattern creazionale che fornisce un'interfaccia per creare un oggetto in una superclasse,
// ma permette alle sottoclassi di alterare il tipo di oggetto che verrà creato. In altre parole,
// questo pattern delega la responsabilità della creazione di oggetti alle sottoclassi, permettendo
// una maggiore flessibilità nell'istanziamento di oggetti di diverse classi che implementano
// la stessa interfaccia o estendono la stessa classe base.