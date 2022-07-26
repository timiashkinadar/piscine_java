package edu.school21.chat.repositories;

import edu.school21.chat.models.Chatroom;
import edu.school21.chat.models.Message;
import edu.school21.chat.models.User;

import javax.sql.DataSource;
import java.sql.*;
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
        Message message = new Message(resultSet.getLong(1), user, chatroom, resultSet.getString("message"), resultSet.getTimestamp("date_mes"));

        optionalMessage = Optional.of(message);
        return optionalMessage;

    }

    public void save(Message message) throws NotSavedSubEntityException, SQLException {
        ResultSet resultSet = null;
        Connection connection = dataSource.getConnection();
        if (message.getAuthor() == null || message.getRoom() == null)
            throw new NotSavedSubEntityException("Could not find author or room for message");
        try {
            PreparedStatement querry = connection.prepareStatement("INSERT INTO CHAT.message (user_id, room_id, message, date_mes) VALUES (?, ?, ?, ?)");
            querry.setLong(1, message.getAuthor().getId());
            querry.setLong(2, message.getRoom().getRoom_id());
            querry.setString(3, message.getMes());
            querry.setTimestamp(4, message.getDate());
            querry.executeUpdate();
        }catch (SQLException e) {
            throw new NotSavedSubEntityException("User or chatroom not saved");
        }
        try {
            ResultSet set = connection.createStatement().executeQuery("SELECT * FROM chat.message");
            if (set.next())
                if (set.isLast()){
                    return;
                }
            message.setMes_id(set.getLong(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
