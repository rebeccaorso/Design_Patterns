package prototypePattern;

public class Car implements Prototype {

    //Queste classi implementano l'interfaccia Prototype e definiscono il metodo clone(). Questa implementazione
    // può variare da una copia superficiale (shallow copy) a una copia profonda (deep copy), a seconda delle necessità.
    private String model;
    private int year;
    private GpsSystem gpsSystem;

    public Car(String model, int year, GpsSystem gpsSystem) {
        this.model = model;
        this.year = year;
        this.gpsSystem = gpsSystem;
    }

    // Copy constructor for a deep copy of the Car
    public Car(Car source) {
        this.model = source.model;
        this.year = source.year;
        this.gpsSystem = new GpsSystem(source.gpsSystem); // Deep copy of GpsSystem
    }

    //Il metodo clone() in ogni classe concreta gestisce la logica per copiare i campi dell'oggetto. Se necessario,
    // il metodo garantirà che la copia sia profonda, clonando anche gli oggetti interni e non solo copiando i loro riferimenti.
    @Override
    public Car clone() {
        return new Car(this);
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public GpsSystem getGpsSystem() { return gpsSystem; }
    public void setGpsSystem(GpsSystem gpsSystem) { this.gpsSystem = gpsSystem; }
}
