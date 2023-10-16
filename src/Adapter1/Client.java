package Adapter1;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        String str = "Hello World";
        String result = target.encrypt(str);
        System.out.println(result);
    }
}
