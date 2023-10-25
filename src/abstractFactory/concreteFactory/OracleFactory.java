package abstractFactory.concreteFactory;

import abstractFactory.factory.Connection;
import abstractFactory.factory.Factory;
import abstractFactory.factory.Statement;

public class OracleFactory extends Factory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }
    public Statement createStatement() {
        return new OracleStatement();
    }
}
