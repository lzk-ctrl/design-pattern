package state;

public class ClosedState implements State{
    private static ClosedState instance = new ClosedState();
    private ClosedState() {}
    public static ClosedState getInstance() {
        return instance;
    }
    @Override
    public void receive() {
        System.out.println("连接已关闭，接收失败");
    }
}
