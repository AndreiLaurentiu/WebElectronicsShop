package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConn = null;
    private Connection conn = null;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if(dbConn == null)
        	dbConn = new DBConnection();
        return dbConn;
    }

    public void startConn() throws SQLException, ClassNotFoundException {
        if(conn == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/web_electronics_shop";
            String user = "root";
            String pass = "root";

            conn = DriverManager.getConnection(url, user, pass);
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
