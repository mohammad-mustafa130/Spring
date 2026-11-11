package six.dao;

import  java.sql.*;

public interface CoreDao {
    String url = "jdbc:mysql://localhost:3306/mydb";
    String username = "mustafa";
    String password = "admin";

    default Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
    default void closeConnection(Connection connection) throws SQLException {
        if(connection == null) return;
        connection.close();
    }
}
