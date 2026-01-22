
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectStudents {

    public static void main(String[] args) {
        try {
            // 1. Connect
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_practice",
                "root",
                "Sappmcsg1$"
            );

            // 2. Write SELECT query
            String sql = "SELECT * FROM students";

            // 3. Prepare statement
            PreparedStatement stmt = conn.prepareStatement(sql);

            // 4. Execute query
            ResultSet rs = stmt.executeQuery();

            // 5. Read data row by row
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("email")
                );
            }

            // 6. Close
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
