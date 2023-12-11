package j13_command_pattern_ex2_undo;

// 실제 Light 객체 (Receiver)
public class Light {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("조명이 켜졌습니다.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("조명이 꺼졌습니다.");
    }

    public boolean isOn() {
        return isOn;
    }
}