package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<ClimateDevice> climateDevices = new ArrayList<>();
    private double currentTemperature;

    public void addDevice(ClimateDevice device) {
        climateDevices.add(device);
    }

    public void removeDevice(ClimateDevice device) {
        climateDevices.remove(device);
    }

    public void notifyDevices() {
        for (ClimateDevice device : climateDevices) {
            device.updateTemperature(currentTemperature);
        }
    }

    public void detectTemperatureChange(double newTemperature) {
        this.currentTemperature = newTemperature;
        notifyDevices();
    }
}
