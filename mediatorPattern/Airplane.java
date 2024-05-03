package mediatorPattern;

public class Airplane implements Aircraft {
    private AirTrafficControl trafficControl;

    public Airplane(AirTrafficControl trafficControl) {
        this.trafficControl = trafficControl;
        trafficControl.registerAircraft(this);
    }

    @Override
    public void sendWarning(String message) {
        trafficControl.sendWarning(this, message);

    }

    @Override
    public void receiveWarning(String message) {
        System.out.println("Aircraft received warning: " + message);
    }
}
