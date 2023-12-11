package j13_command_pattern_ex2_undo;

import java.util.ArrayList;
import java.util.List;

// 리모컨(Invoker)
public class RemoteControl {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void pressButton() {
        for(Command command: commands){
            command.execute();
        }
    }

    // Undo 기능 수행
    public void undoLastCommand() {
        if (!commands.isEmpty()) {
            Command lastCommand = commands.get(commands.size() - 1);
            lastCommand.undo();
            commands.remove(commands.size() - 1);
        }
    }
}
