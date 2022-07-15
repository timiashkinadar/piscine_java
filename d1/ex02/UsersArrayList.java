package d1.ex02;

public class UsersArrayList {
    private User [] users;
    private int capacity;
    private int i;

    public UsersArrayList(){
        this.capacity = 0;
        this.i = 0;
        this.users = new User[capacity];
    }

    public void add_user(User user){
        int j;
        if (users != null){
            users[i] = user;
            i++;
        }
        else {
            capacity = (int)(capacity * 1.5);
            User[] newUs = new User[this.capacity];
            for(j = 0; j < i; j++){
                newUs[j] = users[j];
            }
            newUs[j] = user;
            this.users = newUs;
        }
    }

    public User get_id(int id) throws UserNotFoundException {
        for(int n = 0; n < i; n++) {
            if (users[n].get_id() == id)
                return users[n];
        }
        throw new UserNotFoundException("User " + id + " not found!");
    }

    public User get_ind(int i)
    {
        return users[i];
    }

    public int get_us_num(){
        return i + 1;
    }
}
