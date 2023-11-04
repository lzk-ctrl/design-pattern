package memento;

public class Memento {
    private String command;
    public Memento(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
