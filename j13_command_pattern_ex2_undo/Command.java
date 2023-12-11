package j13_command_pattern_ex2_undo;

public interface Command {
    void execute();

    // Undo 기능을 위한 메서드
    void undo();
}
