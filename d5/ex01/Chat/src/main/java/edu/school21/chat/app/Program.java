package edu.school21.chat.app;

import com.zaxxer.hikari.HikariDataSource;
import edu.school21.chat.models.Message;
import edu.school21.chat.repositories.MessageRepository;
import edu.school21.chat.repositories.MessageRepositoryJdbcImpl;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws SQLException {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        MessageRepository repository = new MessageRepositoryJdbcImpl(dataSource);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message ID");
        System.out.print("->");
        long id = scanner.nextLong();
        try {
            System.out.println(repository.findById(id).get());
        } catch (SQLException e){
            System.err.println("No message with id = " + id);
        }
    }
}
