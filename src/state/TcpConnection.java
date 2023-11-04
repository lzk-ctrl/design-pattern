package state;

public class TcpConnection{
    private State state;
    public TcpConnection() {
        state = ClosedState.getInstance();
    }
    public void receive() {
        state.receive();
    }

    public void changeState(State state) {
        this.state = state;
    }

}
