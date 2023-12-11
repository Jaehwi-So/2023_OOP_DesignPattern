package j13_command_pattern;

import j13_command_pattern.command.AddValueCommand;
import j13_command_pattern.command.Command;
import j13_command_pattern.command.SquareValueCommand;
import j13_command_pattern.command.SubtractValueCommand;
import j13_command_pattern.invoker.CommandManager;

public class Main {

    public static void main(String[] args){

        Command addC = new AddValueCommand(10, 5);
        Command subC = new SubtractValueCommand(22, 2);
        Command squareC = new SquareValueCommand(2);

        CommandManager manager = new CommandManager();
        manager.addOperation(addC);
        manager.addOperation(subC);
        manager.addOperation(squareC);

        manager.performOperations();



    }
}
