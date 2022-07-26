package edu.school21.chat.app;

import com.zaxxer.hikari.HikariDataSource;
import edu.school21.chat.models.Chatroom;
import edu.school21.chat.models.Message;
import edu.school21.chat.models.User;
import edu.school21.chat.repositories.MessageRepository;
import edu.school21.chat.repositories.MessageRepositoryJdbcImpl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws SQLException {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        MessageRepository repository = new MessageRepositoryJdbcImpl(dataSource);

        User user = new User(7, "user", "user", new ArrayList<>(), new ArrayList<>());
        Chatroom chatroom = new Chatroom(3, "chatroom", user,new ArrayList<>());
        Message message = new Message(null, user, chatroom, "Hey!", Timestamp.valueOf(LocalDateTime.now()));
        repository.save(message);
    }
}
