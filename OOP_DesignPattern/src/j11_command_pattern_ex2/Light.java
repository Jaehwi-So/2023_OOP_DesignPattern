package j11_command_pattern_ex;

// 실제 Light 객체 (Receiver)
public class Light {
    public void turnOn() {
        System.out.println("조명이 켜졌습니다.");
    }

    public void turnOff() {
        System.out.println("조명이 꺼졌습니다.");
    }
}