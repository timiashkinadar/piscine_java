package d1.ex02;

public class UserIdsGenerator {
    private static int id = 0;
    private static UserIdsGenerator instance;

    private UserIdsGenerator(){};
    public static UserIdsGenerator getInstance()
    {
        if(instance == null)
            instance = new UserIdsGenerator();
        return instance;
    }

    public int generateId() {
        return ++id;
    }
}
