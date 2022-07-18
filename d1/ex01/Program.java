package d1.ex01;

public class Program {
    public static void main(String[] args) {
        User masha = new User("masha", -100);
        User sasha = new User("sasha", 100);
        User pasha = new User("pasha", 100);

        System.out.println(masha.get_id());
        System.out.println(sasha.get_id());
        System.out.println(pasha.get_id());

    }
}
