package flyweight;

import java.util.HashMap;

public class UserFactory {
    private static final UserFactory instance = new UserFactory();
    private HashMap<Integer, User> userMap = new HashMap<>();

    private UserFactory() {
    }

    public static UserFactory getInstance() {
        return instance;
    }


    public User getUser(int type) {
        User user = userMap.get(type);
        if (user == null) {
            user = new User(type);
            userMap.put(type, user);
        }
        return user;
    }
}
