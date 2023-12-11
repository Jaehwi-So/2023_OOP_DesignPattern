package j13_command_pattern_professor;

public class SquareValueCommand implements Command {
    int x;

    public SquareValueCommand(int x) {
        this.x = x;
    }

    public void execute() {
        System.out.printf("pow(%d, 2) = %d\n", x, x * x);
    }
}
