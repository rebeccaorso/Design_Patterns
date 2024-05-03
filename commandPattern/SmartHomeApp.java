package commandPattern;

public class SmartHomeApp {
    //Configura il sistema di comandi associando i comandi specifici agli invokers e imposta il receiver di ogni comando.
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command toggleLivingRoomLight = new LightToggleCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(toggleLivingRoomLight);
        remote.pressButton();  // Toggles the light on
        remote.pressButton();  // Toggles the light off
    }

}
