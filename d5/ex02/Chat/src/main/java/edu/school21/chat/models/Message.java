package edu.school21.chat.models;

import java.sql.Timestamp;

public class Message {
    private Long mes_id;
    private User wr;
    private Chatroom room;
    private String mes;
    private Timestamp date;

    public Message(Long mes_id, User wr, Chatroom room, String mes, Timestamp date){
        this.mes_id = mes_id;
        this.wr = wr;
        this.room = room;
        this.mes = mes;
        this.date = date;
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
        return "Message : {\n" +
                "id = " + mes_id +
                ", \nauthor = " + wr +
                ", \nroom = " + room +
                ", \ntext = " + mes +
                ", \ndateTime = " + date +  "\n" +
                "}";
    }
    public long getMes_id(){
        return mes_id;
    }
    public User getAuthor(){
        return wr;
    }
    public Chatroom getRoom(){
        return room;
    }
    public String getMes(){
        return mes;
    }
    public Timestamp getDate(){
        return date;
    }

    public void setMes_id(long id){
        this.mes_id = id;
    }
}

