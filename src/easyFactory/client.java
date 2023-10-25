package easyFactory;

public class client {
    public static void main(String[] args) {
        shape s1 = null;
        try {
            s1 = Factory.getShape("Triangle");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        s1.draw();
        s1.erase();
        shape s2 = null;
        try {
            s2 = Factory.getShape("Rectangle");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        s2.draw();
        s2.erase();
        shape s3 = null;
        try {
            s3 = Factory.getShape("Circle");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        s3.draw();
        s3.erase();
    }
}
