package d1.ex00;

public class User {
    private long id;
    private String name;
    private long bal;
    public User (long id, String name, int bal)
    {
        this.name = name;
        this.id = id;
        set_balance(bal);
    }
    public void set_balance(long bal){
        if (bal > 0)
            this.bal = bal;
        else
            this.bal = 0;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_id(long id){
        this.id = id;
    }
    public long get_id(){
        return id;
    }
    public String get_name() {
        return name;
    }
    public long get_bal(){
        return bal;}
}
