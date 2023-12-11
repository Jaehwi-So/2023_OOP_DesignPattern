package j13_command_pattern_ex2_undo;


// Light를 끄는 명령 클래스
public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn(); // Light를 켜는 것으로 간주하여 Undo
    }
}