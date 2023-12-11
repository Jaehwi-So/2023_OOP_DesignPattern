package j13_command_pattern_ex2_undo;

// Light를 켜는 명령 클래스
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff(); // Light를 끄는 것으로 간주하여 Undo
    }
}
