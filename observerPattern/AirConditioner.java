package observerPattern;

public class AirConditioner implements ClimateDevice {
    @Override
    public void updateTemperature(double temperature) {
        System.out.println("Air Conditioner: Adjusting temperature to " + temperature + "°C");

    }
}
