package prototypePattern;

public class Client {
    //Il client interagisce con l'interfaccia Prototype per clonare gli oggetti, evitando di legarsi a classi concrete.
    // Questo passaggio decoppia il codice client dalle classi specifiche degli oggetti che necessita di duplicare,
    // migliorando la flessibilità e la manutenibilità del codice.
    public static void main(String[] args) {
        GpsSystem gpsSystem = new GpsSystem("1.0");
        Car car = new Car("Toyota", 2021, gpsSystem);

        Car clonedCar = car.clone();
        System.out.println("Original car model: " + car.getModel());
        System.out.println("Cloned car model: " + clonedCar.getModel());

        // Modifying the GPS system of the cloned car to check for deep copy
        clonedCar.getGpsSystem().setVersion("2.0");
        System.out.println("Original car GPS version: " + car.getGpsSystem().getVersion());
        System.out.println("Cloned car GPS version: " + clonedCar.getGpsSystem().getVersion());
    }
}
