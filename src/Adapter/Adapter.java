package Adapter;

public class Adapter extends Adaptee implements Target{
    public String encrypt(String str) {
        return super.encryptApi(str);
    }

}
