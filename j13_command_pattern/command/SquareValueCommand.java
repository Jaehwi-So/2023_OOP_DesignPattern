package j13_command_pattern.command;

public class SquareValueCommand implements Command{
    private int x;

    @Override
    public int execute() {
        return this.x * this.x;
    }

    public SquareValueCommand(int x){
        this.x = x;
    }
}
