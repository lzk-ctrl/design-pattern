package abstractFactory.concreteFactory;

import abstractFactory.factory.Statement;

public class OracleStatement extends Statement {
    @Override
    public void doStatement() {
        System.out.println("OracleStatement: doStatement()");
    }
}
