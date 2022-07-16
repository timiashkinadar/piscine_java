package d1.ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {
        UsersArrayList aa = new UsersArrayList();
        User ds = new User("sdfjd", 77);
//        aa.add_user(new User("dfd", 3434));
//        System.out.print(ds.get_id());
        aa.add_user(ds);

//        User gh;
//        try{
//            gh = aa.get_ind(6);
//        }catch(UserNotFoundException e){
//            System.out.print("User is undefined\n");
//            return;
//        }

        User gh = aa.get_ind(0);
        System.out.print(gh.get_us_id());

    }

}
