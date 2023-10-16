package factory.connect;

import factory.framework.Factory;
import factory.framework.Product;

public class IMPACFactory extends Factory {
    @Override
    public Product getConnection() {
        return new IMPAC();
    }
}
