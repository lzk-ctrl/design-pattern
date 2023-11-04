package state;

public class ListeningState implements State{
    private static ListeningState instance = new ListeningState();
    private ListeningState() {}
    public static ListeningState getInstance() {
        return instance;
    }
    @Override
    public void receive() {
        System.out.println("正在监听，接收成功");
    }
}
