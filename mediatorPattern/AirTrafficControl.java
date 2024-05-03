package mediatorPattern;

public interface AirTrafficControl {
    void registerAircraft(Aircraft aircraft);

    void sendWarning(Aircraft aircraft, String message);
}
