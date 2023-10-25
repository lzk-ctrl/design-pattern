package abstractFactory;

import abstractFactory.concreteFactory.MySqlFactory;
import abstractFactory.concreteFactory.OracleFactory;
import abstractFactory.factory.Factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new MySqlFactory();
        factory.createConnection().doConnection();
        factory.createStatement().doStatement();
        factory=new OracleFactory();
        factory.createConnection().doConnection();
        factory.createStatement().doStatement();
    }
}
