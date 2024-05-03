package abstractFactoryMethod;

public class LandAnimal implements Animal{
    @Override
    public void move() {
        System.out.println("Land animal is moving.");
    }
}
