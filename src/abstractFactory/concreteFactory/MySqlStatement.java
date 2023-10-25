package abstractFactory.concreteFactory;

import abstractFactory.factory.Statement;

public class MySqlStatement extends Statement {
    @Override
    public void doStatement() {
        System.out.println("MySqlStatement: doStatement()");
    }
}
