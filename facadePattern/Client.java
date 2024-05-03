package facadePattern;

public class Client {
    public static void main(String[] args) {
        CarMultimediaSystem carSystem = new CarMultimediaSystem();

        carSystem.startMusic();
        carSystem.startVideo();
        carSystem.makeCall();
    }
}
