package d1.ex00;

public class User {
    private long id;
    private String name;
    private long bal;
    public User (long id, String name)
    {
        this.name = name;
        this.id = id;
    }
    public void set_balance(long bal){
        if (bal > 0)
            this.bal = bal;
        else
            this.bal = 0;
    }
    public long get_id(){
        return id;
    }
    public String get_name() {
        return name;
    }
    public long get_bal(){return bal;}
}
