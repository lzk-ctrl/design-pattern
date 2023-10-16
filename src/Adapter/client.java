package Adapter;

public class client {
    public static void main(String[] args) {
        Target target = new Adapter();
        String str = target.encrypt("Hello World");
        System.out.println(str);
    }
}
