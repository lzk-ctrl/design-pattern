package state;

public class Main {
    public static void main(String[] args) {
        TcpConnection connection = new TcpConnection();
        connection.receive();
        connection.changeState(EstablishedState.getInstance());
        connection.receive();
        connection.changeState(ListeningState.getInstance());
        connection.receive();
        connection.changeState(ClosedState.getInstance());
        connection.receive();
    }
}
