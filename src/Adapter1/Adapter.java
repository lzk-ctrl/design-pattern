package Adapter1;

public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String encrypt(String str) {
        return adaptee.encryptApi(str);
    }
}
