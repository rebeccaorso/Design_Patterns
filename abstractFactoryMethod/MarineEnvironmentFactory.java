package abstractFactoryMethod;

public class MarineEnvironmentFactory implements  EnvironmentFactory{
    @Override
    public Animal createAnimal() {
        return new SeaCreature();
    }

    @Override
    public Plant createPlant() {

        return new Seaweed();
    }
}
