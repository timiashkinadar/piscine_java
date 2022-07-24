package edu.school21.chat.models;

import java.util.List;

public class User {
    private int id;
    private String login;
    private String password;
    private List<Chatroom> cr_rooms;
    private List<Chatroom> users_ch;

    User(int id, String login, String password, List<Chatroom> cr, List<Chatroom> us){
        this.id = id;
        this.login = login;
        this.password = password;
        this.cr_rooms = cr;
        this.users_ch = us;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object a){
        return super.equals(a);
    }

    @Override
    public String toString(){
        return "User INFO: " +
                "id = " + id +
                ", login = " + login +
                ", password = " + password +
                ", created rooms = " + cr_rooms +
                ", rooms = " + users_ch;
    }
}
