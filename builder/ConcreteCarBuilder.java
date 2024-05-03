package builder;

public class ConcreteCarBuilder implements CarBuilder{

    //Le classi Concrete Builder implementano l'interfaccia Builder, fornendo dettagli specifici
    // su come ciascuna delle parti dell'oggetto deve essere costruita. Ogni Concrete Builder è responsabile
    // della costruzione di una variante particolare del prodotto, gestendo i dettagli di costruzione specifici.
    private String brand;
    private String model;
    private String color;
    private int numberOfDoors;
    private String carScreenSpecs;
    private double weight;
    private double height;
    private String uniqueIdentifier;
    @Override
    public CarBuilder setBrand(String brand) {
        return null;
    }

    @Override
    public CarBuilder setModel(String model) {
        return null;
    }

    @Override
    public CarBuilder setColor(String color) {
        return null;
    }

    @Override
    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        return null;
    }

    @Override
    public CarBuilder setCarScreenSpecs(String specs) {
        return null;
    }

    @Override
    public CarBuilder setWeight(double weight) {
        return null;
    }

    @Override
    public CarBuilder setHeight(double height) {
        return null;
    }

    @Override
    public CarBuilder setUniqueIdentifier(String id) {
        return null;
    }

    @Override
    public Car build() {
        return null;
    }
}
