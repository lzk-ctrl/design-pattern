package factory;

import factory.connect.HTTP;
import factory.connect.HTTPFactory;
import factory.connect.IMPACFactory;
import factory.connect.POP3Factory;
import factory.framework.Factory;
import factory.framework.Product;


public class client {

    public static void main(String[] args) {
        Factory factory = new HTTPFactory();
        Product product = factory.getConnection();
        product.connect();

        factory = new POP3Factory();
        product = factory.getConnection();
        product.connect();

        factory = new IMPACFactory();
        product = factory.getConnection();
        product.connect();
    }
}