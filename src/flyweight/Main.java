package flyweight;

public class Main {
    public static void main(String[] args){
        UserFactory userFactory = UserFactory.getInstance();
        User user1 = userFactory.getUser(1);
        User user2 = userFactory.getUser(2);
        User user3 = userFactory.getUser(1);
        User user4 = userFactory.getUser(3);
        user1.getType();
        user2.getType();
        user3.getType();
        user4.getType();
        System.out.println(user1 == user3);
    }
}
