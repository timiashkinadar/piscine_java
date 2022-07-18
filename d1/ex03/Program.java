package d1.ex03;


import javax.jws.soap.SOAPBinding;
import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        UsersArrayList arr = new UsersArrayList();
        User k = new User("Kolya", 800);
        User a = new User("polya", 900);
        User s = new User("olya", 600);

        Transaction tr = new Transaction(UUID.randomUUID(), a, s,60);
        TransactionLinkedList t = new TransactionLinkedList();
        t.add_trans(new Transaction(UUID.randomUUID(), s, k, 80));
        t.add_trans(new Transaction(UUID.randomUUID(), k, a, - 80));
        t.print();
    }
}
