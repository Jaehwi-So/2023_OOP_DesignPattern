package j13_command_pattern_professor;

public class MultiplyValueCommand implements Command {
    private int x, y;
    public MultiplyValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute() {
        System.out.printf("%d * %d = %d\n", x, y, x * y);
    }

}
