package j13_command_pattern_professor;


public class Main {
    public static void main(String[] args) {
        CommandManager mgr = new CommandManager();
        mgr.addOperation(new AddValueCommand(2, 3));
        mgr.addOperation(new SubtractValueCommand(2, 3));
        mgr.addOperation(new MultiplyValueCommand(2, 3));
        mgr.addOperation(new ModuloValueCommand(2, 3));
        mgr.addOperation(new SquareValueCommand(3));
        mgr.performOperations();
    }
}
