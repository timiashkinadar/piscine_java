package d1.ex02;

public class UsersArrayList implements UsersList {
    private User [] users;
    private int capacity;
    private int i;

    public UsersArrayList(){
        this.capacity = 10;
        this.i = 0;
        this.users = new User[capacity];
    }

    public void add_user(User user){
        int j;
        if (i < users.length){
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
            j++;
            i = j;
            this.users = newUs;
        }
    }

    public User get_id(int id) throws UserNotFoundException {
        for(int n = 0; n < i; n++) {
            if (users[n].get_us_id() == id)
                return users[n];
        }
        throw new UserNotFoundException("User " + id + " not found!");
    }

    public User get_ind(int i) throws UserNotFoundException
    {
        if (i < this.i)
            return users[i];
        throw new UserNotFoundException("User " + i + " not found!");
    }

    public int get_us_num(){
        return i;
    }
}
