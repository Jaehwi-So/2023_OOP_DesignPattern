package j13_command_pattern_ex;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand turnOnCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        // 버튼 누르면 조명 켜기
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        // 버튼 누르면 조명 끄기
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}
