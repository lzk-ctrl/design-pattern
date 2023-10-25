package abstractFactory.concreteFactory;

import abstractFactory.factory.Connection;

public class OracleConnection extends Connection {
    @Override
    public void doConnection() {
        System.out.print("OracleConnection: doConnection()\n");
    }
}
