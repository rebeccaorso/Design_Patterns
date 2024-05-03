package abstractFactoryMethod;

public class AerialEnvironmentFactory implements EnvironmentFactory{
    @Override
    public Animal createAnimal() {
        return new Bird();
    }

    @Override
    public Plant createPlant() {
        return new AirPlant();
    }

}
