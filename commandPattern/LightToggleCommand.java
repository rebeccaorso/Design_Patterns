package commandPattern;

public class LightToggleCommand implements Command{
    //Ogni comando concreto estende l'interfaccia Command
    // e implementa execute() invocando l'azione sul receiver.

    private Light light;

    public LightToggleCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.toggle();
    }
}
