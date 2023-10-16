package factory.connect;

import factory.framework.Factory;
import factory.framework.Product;
public class HTTPFactory extends Factory{
    public Product getConnection() {
        return new HTTP();
    }
}
