package d1.ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        User Kolya = new User(12324, "Kolya", 500);
        User Petya = new User(12327, "Petya", 600);

        Transaction transact = new Transaction(UUID.randomUUID(), Kolya, Petya, -60, Transaction.Cat.INCOME);
        System.out.println("Transaction id = " + transact.get_id());
        System.out.println("Rec id - " + transact.get_rec().get_id());
        System.out.println("Rec balance - " + transact.get_rec().get_bal());
        System.out.println("Send id - " + transact.get_send().get_id());
        System.out.println("Send bal - " + transact.get_send().get_bal());
        System.out.println("Category - " + transact.get_cat());
        System.out.println("Sum - " + transact.get_sum());
    }
}
