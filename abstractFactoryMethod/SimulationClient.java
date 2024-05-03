package abstractFactoryMethod;

public class SimulationClient {
    public static void main(String[] args) {
        EnvironmentFactory terrestrialFactory = new TerrestrialEnvironmentFactory();
        Animal landAnimal = terrestrialFactory.createAnimal();
        Plant tree = terrestrialFactory.createPlant();

        EnvironmentFactory marineFactory = new MarineEnvironmentFactory();
        Animal seaCreature = marineFactory.createAnimal();
        Plant seaweed = marineFactory.createPlant();

        EnvironmentFactory aerialFactory = new AerialEnvironmentFactory();
        Animal bird = aerialFactory.createAnimal();
        Plant airPlant = aerialFactory.createPlant();

        landAnimal.move();
        tree.grow();

        seaCreature.move();
        seaweed.grow();

        bird.move();
        airPlant.grow();
    }
}
