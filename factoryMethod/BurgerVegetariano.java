package factoryMethod;

//Si creano una o più classi concrete che implementano l'interfaccia del prodotto. Ogni classe rappresenta
// una diversa implementazione del prodotto. Questi sono gli oggetti effettivi che verranno creati dal factory method.
public class BurgerVegetariano implements Burger {

    @Override
    public void prepara() {
        System.out.println("Preparazione BurgerVegetariano.");
    }

    @Override
    public void cucina() {
        System.out.println("Cucina BurgerVegetariano.");
    }

    @Override
    public void servi() {
        System.out.println("Servizio BurgerVegetariano.");
    }
}
