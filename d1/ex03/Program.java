package d1.ex03;


import javax.jws.soap.SOAPBinding;
import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        UsersArrayList arr = new UsersArrayList();
        User k = new User("Kolya", 800);
        User a = new User("polya", 900);
        User s = new User("olya", 600);

        TransactionLinkedList list = new TransactionLinkedList();
        Transaction t1 = new Transaction(UUID.randomUUID(), s, k, 80);
        Transaction t2 = new Transaction(UUID.randomUUID(), a, s, 50);
        Transaction t3 = new Transaction(UUID.randomUUID(), k, a, 70);
        Transaction t4 = new Transaction(UUID.randomUUID(), s, a, 10);

        list.add_trans(t1);
        list.add_trans(t2);
        list.add_trans(t3);

        list.delete_by_id(t3.getId());

        Transaction [] m_t = list.list_to_arr();

        for (Transaction transaction : m_t) {
            System.out.println(transaction.print_tr() + "\n");
        }
//        list.print();
    }
}
