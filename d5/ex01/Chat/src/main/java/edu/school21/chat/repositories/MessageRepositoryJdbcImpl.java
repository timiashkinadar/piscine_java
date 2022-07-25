package edu.school21.chat.repositories;

import edu.school21.chat.models.Message;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class MessageRepositoryJdbcImpl implements MessageRepository {
    private final DataSource dataSource;

    public MessageRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
//    @Override
    public Optional<Message> findById(Long id) throws SQLException{
        Connection conn = this.dataSource.getConnection();
        conn.nativeSQL("SELECT * FROM message WHERE id = 3");
    }
}
