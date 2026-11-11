package six.daodemo;

import java.sql.*;

class MyDao {
    String url = "jdbc:mysql://localhost:3306/mydb";
    String username = "mustafa";
    String password = "admin";
    String driver = "com.mysql.cj.jdbc.Driver";

    public Connection doConnect() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }
    public PreparedStatement getStatement(Connection con, String query) throws SQLException {
        return con.prepareStatement(query);
    }
    public ResultSet getData(PreparedStatement pst) throws SQLException {
        return pst.executeQuery();
    }
    public boolean storeData(PreparedStatement pst) throws SQLException {
        return pst.execute();
    }
}
