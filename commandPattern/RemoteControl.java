package commandPattern;

public class RemoteControl {
    //Invoca il comando da eseguire. L'invoker non conosce i dettagli del comando, solo che può essere eseguito.

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
