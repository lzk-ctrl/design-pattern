package flyweight;

public class User {
    private int type;
    public User(int type) {
        this.type = type;
    }
    public void getType() {
        System.out.println("User type: " + type);
    }
}
