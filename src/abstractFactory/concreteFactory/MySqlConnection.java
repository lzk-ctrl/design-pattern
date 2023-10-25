package abstractFactory.concreteFactory;

import abstractFactory.factory.Connection;

public class MySqlConnection extends Connection {

    @Override
    public void doConnection() {
        System.out.println("MySqlConnection: doConnection()");
    }
}
