package observerPattern;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        AirConditioner airConditioner = new AirConditioner();
        HeatingSystem heatingSystem = new HeatingSystem();

        temperatureSensor.addDevice(airConditioner);
        temperatureSensor.addDevice(heatingSystem);

        double newTemperature = 22.5;
        temperatureSensor.detectTemperatureChange(newTemperature);
    }
}
