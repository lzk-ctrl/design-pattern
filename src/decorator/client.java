package decorator;

public class client {
    public static void main(String[] args) {
        Display d1 = new TextDisplay("Hello, world.");
        Display d2 = new Header1(d1);
        d2 = new Header2(d2);
        d2=new Footer1(d2);
        d2=new Footer2(d2);
        d2.show();
    }
}
