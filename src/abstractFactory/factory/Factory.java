package abstractFactory.factory;

public abstract class Factory {
    public abstract Connection createConnection();
    public abstract Statement createStatement();
}
