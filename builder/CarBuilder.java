package builder;

public interface CarBuilder {

    //L'interfaccia Builder definisce i metodi per costruire le varie parti di un prodotto complesso.
    // Questi metodi permettono di specificare parti diverse dell'oggetto finale, come ad esempio la marca, il modello, il colore di un'auto, ecc.
    CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    CarBuilder setNumberOfDoors(int numberOfDoors);
    CarBuilder setCarScreenSpecs(String specs);
    CarBuilder setWeight(double weight);
    CarBuilder setHeight(double height);
    CarBuilder setUniqueIdentifier(String id);
    Car build();
}
