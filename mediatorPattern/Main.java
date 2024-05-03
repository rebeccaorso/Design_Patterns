package mediatorPattern;

public class Main {
    public static void main(String[] args) {

        AirTrafficControl trafficControl = new TrafficTower();

        Aircraft airplane1 = new Airplane(trafficControl);
        Aircraft airplane2 = new Airplane(trafficControl);
        Aircraft airplane3 = new Airplane(trafficControl);

        airplane1.sendWarning("Traffic congestion ahead. Please adjust your course.");
    }
}
