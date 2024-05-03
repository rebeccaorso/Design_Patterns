package abstractFactoryMethod;

public class SeaCreature implements Animal {
    @Override
    public void move() {
        System.out.println("Sea creature is swimming.");
    }
}
