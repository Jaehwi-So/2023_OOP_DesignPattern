package j13_command_pattern.command;

public class SubtractValueCommand implements Command{
    private int x;
    private int y;
    @Override
    public int execute() {
        return this.x - this.y;
    }

    public SubtractValueCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
}
