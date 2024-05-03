package abstractFactoryMethod;

public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("Bird is flying.");
    }
}
