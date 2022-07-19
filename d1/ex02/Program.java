package d1.ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {
        UsersArrayList aa = new UsersArrayList();

        aa.add_user(new User("1", 600));
        aa.add_user(new User("2", 600));
        aa.add_user(new User("3", 600));
        aa.add_user(new User("4", 600));
        aa.add_user(new User("5", 600));
        aa.add_user(new User("6", 600));
        aa.add_user(new User("7", 600));
        aa.add_user(new User("8", 600));
        aa.add_user(new User("9", 600));
        aa.add_user(new User("10", 600));
        aa.add_user(new User("11", 600));
        aa.add_user(new User("12", 600));

        System.out.println("Num of users - " + aa.get_us_num());


        System.out.println(aa.get_ind(1).get_name());
        System.out.println(aa.get_id(50).get_name());
    }

}
