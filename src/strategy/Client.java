package strategy;

public class Client {
    public static void main(String[] args) {
        User user = new User(new PreCopy());
        user.useCopy();
        user=new User(new PostCopy());
        user.useCopy();
        user=new User(new CRRTMotion());
        user.useCopy();
    }
}
