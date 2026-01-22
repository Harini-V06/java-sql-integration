// Method to get database connection
import java.sql.Connection;
//Helps Java find and connect to the correct database driver
import java.sql.DriverManager;
import java.sql.SQLException;

public class Making_Connection {
 // One connection to one database only
// Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", user, pass);
//Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", user, pass);
// stmt.execute("USE db2");
// New database just change the String url to the databse name

    public static Connection getConnection() throws SQLException {
        // Database Connection Details
        // The address of your MySQL database.
        String url = "the url";
        String user = "root";
        String password = "password";

        return DriverManager.getConnection(url, user, password);
        // DriverManager.getConnection() tries to establish a connection using the URL, username, and password.

    }

    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            System.out.println("Connected to database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


