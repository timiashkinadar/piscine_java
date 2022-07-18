package d1.ex00;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User rec;
    private User send;
    private Cat cat;
    private long sum;

    public Transaction(UUID uuid, User rec, User send, long sum, Cat cat) {
        this.id = UUID.randomUUID();
        this.rec = rec;
        this.send = send;
        this.cat = cat;
//        if (sum < 0) {
//            this.sum = sum;
//            set_cat(Cat.OUTCOME);
//        } else if (sum > 0) {
//            this.sum = sum;
//            set_cat(Cat.INCOME);
//        }
        set_sum(sum);
        send.set_balance(send.get_bal() - this.sum);
        rec.set_balance(rec.get_bal() + this.sum);
    }
    public UUID get_id(){
        return id;
    }
    public User get_rec(){
        return rec;
    }
    public User get_send(){
        return send;
    }
    public void set_cat(Cat cat){
        this.cat = cat;
    }
    public Cat get_cat(){
        return cat;
    }
    public void set_sum(long sum){
        if(cat == Cat.INCOME) {
            if (sum > 0)
                this.sum = sum;
            else
                this.sum = 0;
        }
        else if (cat == Cat.OUTCOME)
        {
            if (sum < 0)
                this.sum = sum;
            else
                this.sum = 0;
        }

    }
    public enum Cat{
        INCOME,
        OUTCOME
    }
    public long get_sum(){
        return sum;
    }
}
