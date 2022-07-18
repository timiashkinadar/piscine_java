package d1.ex02;

public class User {
    private String name;
    private int bal;
    private int id;
    public User(String name, int bal) {
        this.name = name;
        if (bal > 0)
            this.bal = bal;
        else
            this.bal = 0;
        this.id = UserIdsGenerator.getInstance().generateId();
    }
    public int get_us_id(){
        return id;
    }
    public String get_name() {
        return name;
    }
}