package factory.connect;

import factory.framework.Factory;
import factory.framework.Product;

public class POP3Factory extends Factory {

    @Override
    public Product getConnection() {
        return new POP3();
    }
}
