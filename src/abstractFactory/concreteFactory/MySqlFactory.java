package abstractFactory.concreteFactory;

import abstractFactory.factory.Connection;
import abstractFactory.factory.Factory;
import abstractFactory.factory.Statement;

public class MySqlFactory extends Factory {

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySqlStatement();
    }
}
