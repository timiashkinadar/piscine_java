package d1.ex02;

public interface UsersList {
    public void add_user(User user);
    public User get_id(int id) throws UserNotFoundException;
    public User get_ind(int i) throws UserNotFoundException;
    public int get_us_num();
}
