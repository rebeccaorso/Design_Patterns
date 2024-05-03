package mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class TrafficTower implements AirTrafficControl {
    private List<Aircraft> aircraftList = new ArrayList<>();

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    @Override
    public void sendWarning(Aircraft aircraft, String message) {
        for (Aircraft a : aircraftList) {
            if (a != aircraft) {
                a.receiveWarning(message);
            }
        }
    }
}
