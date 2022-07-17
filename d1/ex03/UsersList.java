package d1.ex03;

public interface UsersList {
    public void add_user(d1.ex02.User user);
    public d1.ex02.User get_id(int id) throws UserNotFoundException;
    public User get_ind(int i) throws UserNotFoundException;
    public int get_us_num();
}