package command;

public class Main {
    public static void main(String[] args){
        Light light1= new Light("light1");
        Light light2= new Light("light2");
        Light light3= new Light("light3");
        Light light4= new Light("light4");
        Light light5= new Light("light5");
        TotalCommand commands = new TotalCommand();
        Command command1 = new OneCommand(light1, 1);
        Command command2 = new OneCommand(light2, 0);
        Command command3 = new OneCommand(light3, 1);
        Command command4 = new OneCommand(light4, 0);
        Command command5 = new OneCommand(light5, 1);
        commands.addCommand(command1);
        commands.addCommand(command2);
        commands.addCommand(command3);
        commands.addCommand(command4);
        commands.addCommand(command5);
        commands.execute();
    }
}
