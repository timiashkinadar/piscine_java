package edu.school21.chat.repositories;

import edu.school21.chat.models.Chatroom;
import edu.school21.chat.models.Message;
import edu.school21.chat.models.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class MessageRepositoryJdbcImpl implements MessageRepository {
    private final DataSource dataSource;

    public MessageRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public Optional<Message> findById(Long id) throws SQLException{

        Optional<Message> optionalMessage;

        Connection conn = this.dataSource.getConnection();

        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM CHAT.Message WHERE message_id = " + id);

        resultSet.next();

        User user = new User(1, "user", "user", null, null);
        Chatroom chatroom = new Chatroom(1, "chatroom", null,null);
        Message message = new Message(resultSet.getInt(1), user, chatroom, resultSet.getString("message"), resultSet.getTimestamp("date_mes"));

        optionalMessage = Optional.of(message);
        return optionalMessage;

    }
}
