package d1.ex00;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User rec;
    private User send;
    private Cat cat;
    private long sum;

    public Transaction(UUID id, User rec, User send, long sum) {
        this.id = id;
        this.rec = rec;
        this.send = send;
        if (sum < 0) {
            this.sum = sum;
            set_cat(Cat.OUTCOME);
        } else if (sum > 0) {
            this.sum = sum;
            set_cat(Cat.INCOME);
        }
        send.set_balance(send.get_bal() - this.sum);
        rec.set_balance(rec.get_bal() + this.sum);
    }
    public void set_cat(Cat cat){
        this.cat = cat;
    }
    public Cat get_cat(){
        return cat;
    }
    public enum Cat{
        INCOME,
        OUTCOME
    }
    public long get_sum(){
        return sum;
    }
}
