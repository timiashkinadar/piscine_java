package edu.school21.chat.models;

import java.util.List;

public class User {
    private long id;
    private String login;
    private String password;
    private List<Chatroom> cr_rooms;
    private List<Chatroom> users_ch;

    public User(long id, String login, String password, List<Chatroom> cr, List<Chatroom> us){
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
        return "User : {" +
                "id = " + id +
                ", login='" + login + '\'' +
                ", password = " + password + '\'' +
                ", created rooms = " + cr_rooms +
                ", rooms = " + users_ch +
                "}";
    }
    public long getId(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public List<Chatroom> getRoom(){
        return cr_rooms;
    }
    public List<Chatroom> getUsers_ch(){
        return users_ch;
    }
}
