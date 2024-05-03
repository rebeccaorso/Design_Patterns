package abstractFactoryMethod;

public class TerrestrialEnvironmentFactory implements EnvironmentFactory{

    @Override
    public Animal createAnimal() {
        return new LandAnimal();
    }

    @Override
    public Plant createPlant() {
        return new Tree();
    }
}
