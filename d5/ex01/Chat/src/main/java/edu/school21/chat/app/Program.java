package edu.school21.chat.app;

import com.zaxxer.hikari.HikariDataSource;

public class Program {

    public static void main(String[] args) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        dataSource.

    }
}
