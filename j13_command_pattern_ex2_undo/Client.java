package j13_command_pattern_ex2_undo;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand turnOnCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
        remoteControl.undoLastCommand();
    }
}
