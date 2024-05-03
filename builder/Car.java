package builder;

public class Car {

    //Il Prodotto è l'oggetto complesso che viene costruito. Ad esempio, un'auto con tutte le specifiche definite
    // durante il processo di costruzione (marca, modello, colore, etc.). Non è direttamente coinvolto
    // nella logica di costruzione ma è il risultato finale della costruzione del builder.
    private String brand;
    private String model;
    private String color;
    private int numberOfDoors;
    private String carScreenSpecs;
    private double weight;
    private double height;
    private String uniqueIdentifier;

    public Car(String brand, String model, String color, int numberOfDoors,
               String carScreenSpecs, double weight, double height, String uniqueIdentifier) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.carScreenSpecs = carScreenSpecs;
        this.weight = weight;
        this.height = height;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", carScreenSpecs='" + carScreenSpecs + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", uniqueIdentifier='" + uniqueIdentifier + '\'' +
                '}';
    }
}
