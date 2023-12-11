package j13_command_pattern_professor;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> opList;
    public CommandManager() {
        opList = new ArrayList<Command>();
    }

    public void addOperation(Command op) {
        opList.add(op);
    }

    public void performOperations() {
        for (Command cmd : opList) {
            cmd.execute();
        }
    }
}
