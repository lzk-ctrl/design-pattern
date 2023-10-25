package bridge;

public class Client {
    public static void main(String[] args) {
        App app = new RefineApp(new JPGImpl());
        ((RefineApp) app).use();
        app = new RefineApp(new BMPImpl());
        ((RefineApp) app).use();
    }

}
