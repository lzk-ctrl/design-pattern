package state;

public class EstablishedState implements State {
    private static EstablishedState instance = new EstablishedState();
    private EstablishedState() {}
    public static EstablishedState getInstance() {
        return instance;
    }
    @Override
    public void receive() {
        System.out.println("正在建立连接中，接收失败");
    }
}
