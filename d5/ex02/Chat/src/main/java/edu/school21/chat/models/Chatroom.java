package edu.school21.chat.models;

import java.util.List;

public class Chatroom {
    private long room_id;
    private String room_name;
    private  User room_cr;
    private List<Message> messages;

    public Chatroom(long id, String name, User cr, List<Message> m){
        this.room_id = id;
        this.room_name = name;
        this.room_cr = cr;
        this.messages = m;
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
        return "Chatroom : {" +
                "id = " + room_id +
                ", name = " + room_name + '\'' +
                ", creator = " + room_cr + '\'' +
                ", messages = " + messages +
                "}";
    }
    public long getRoom_id(){
        return room_id;
    }
    public String getRoom_name(){
        return room_name;
    }
    public User getRoom_cr(){
        return room_cr;
    }
    public List<Message> getMessages(){
        return messages;
    }
}
