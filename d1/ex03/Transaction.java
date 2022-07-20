package d1.ex03;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User rec;
    private User send;
    private Transaction.Cat cat;
    private int sum;

    public Transaction(UUID id, User rec, User send, int sum) {
        this.id = id;
        this.rec = rec;
        this.send = send;
        if (sum < 0) {
            this.sum = sum;
            set_cat(Transaction.Cat.OUTCOME);
        } else if (sum > 0) {
            this.sum = sum;
            set_cat(Transaction.Cat.INCOME);
        }
        set_sum(sum);
        if (send.get_bal() > sum) {
            send.set_balance(send.get_bal() - this.sum);
            rec.set_balance(rec.get_bal() + this.sum);
        }
        else
            this.sum = 0;
    }
    public void set_cat(Transaction.Cat cat){
        this.cat = cat;
    }
    public Transaction.Cat get_cat(){
        return cat;
    }
    public enum Cat{
        INCOME,
        OUTCOME
    }
    public void set_sum(int sum){
        if(cat == Transaction.Cat.INCOME) {
            if (sum > 0)
                this.sum = sum;
            else
                this.sum = 0;
        }
        else if (cat == Transaction.Cat.OUTCOME)
        {
            if (sum < 0)
                this.sum = sum;
            else
                this.sum = 0;
        }
    }
    public String print_tr() {
        return "Transaction:\n" +
                "identifier = " + id +
                "\nrecipient = " + rec.get_name() +
                "\nsender = " + send.get_name() +
                "\ncategory = " + cat +
                "\nsum = " + sum;
    }
    public long get_sum(){
        return sum;
    }

    public UUID getId() {
        return id;
    }
}
