package d1.ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        User Kolya = new User(12324, "Kolya");
        User Petya = new User(12327, "Petya");

        Kolya.set_balance(500);
        Petya.set_balance(400);
        Transaction transact = new Transaction(UUID.randomUUID(), Petya, Kolya, -60);
        System.out.println(Petya.get_bal());
        System.out.println(transact.get_cat());
    }
}
