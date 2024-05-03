package abstractFactoryMethod;

public class Tree implements Plant{
    @Override
    public void grow() {
        System.out.println("Tree is growing.");
    }
}
