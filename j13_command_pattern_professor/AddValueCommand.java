package j13_command_pattern_professor;


public class AddValueCommand implements Command {
    private int x, y;
    public AddValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void execute() {
        System.out.printf("%d + %d = %d\n", x, y, x + y);
    }
}
