package observerPattern;

public class HeatingSystem implements ClimateDevice {
    @Override
    public void updateTemperature(double temperature) {
        System.out.println("Heating System: Adjusting temperature to " + temperature + "°C");

    }
}
