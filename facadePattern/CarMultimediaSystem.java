package facadePattern;

public class CarMultimediaSystem {
    private AudioSystem audioSystem;
    private VideoSystem videoSystem;
    private BluetoothConnectivity bluetoothConnectivity;

    public CarMultimediaSystem() {
        audioSystem = new AudioSystem();
        videoSystem = new VideoSystem();
        bluetoothConnectivity = new BluetoothConnectivity();
    }

    // Facade methods
    public void startMusic() {
        audioSystem.playMusic();
    }

    public void stopMusic() {
        audioSystem.stopMusic();
    }

    public void startVideo() {
        videoSystem.playVideo();
    }

    public void stopVideo() {
        videoSystem.stopVideo();
    }

    public void makeCall() {
        bluetoothConnectivity.makeCall();
    }

    public void receiveCall() {
        bluetoothConnectivity.receiveCall();
    }
}

