package j13_command_pattern.invoker;

import j13_command_pattern.command.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> opList;

    public CommandManager(){
        this.opList = new ArrayList<>();
    }

    public void addOperation(Command op){
        this.opList.add(op);
    }

    public void performOperations(){
        for(Command c : opList){
            int result = c.execute();
            System.out.println(result);
        }
    }
}
