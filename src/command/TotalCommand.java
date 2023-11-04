package command;

import java.util.ArrayList;

public class TotalCommand extends Command{
    private ArrayList<Command> commands;
    public TotalCommand(){
        this.commands = new ArrayList<Command>();
    }
    public void addCommand(Command command){
        this.commands.add(command);
    }
    public void execute(){
        for (Command command : this.commands){
            command.execute();
        }
    }

}
