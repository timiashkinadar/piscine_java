package edu.school21.chat.models;

import java.time.LocalDateTime;

public class Message {
    private long mes_id;
    private User wr;
    private Chatroom room;
    private String mes;
    private LocalDateTime date;

    Message(long mes_id, User wr, Chatroom room, String mes, LocalDateTime date){
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
        return "Message INFO: " +
                "id = " + mes_id +
                ", author = " + wr +
                ", room = " + room +
                ", message = " + mes +
                ", date = " + date;
    }
}

