import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class FetchStudents {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_practice";
        String user = "root";
        String password = "your_mysql_password";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + " | " + email + " | " + age);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
