import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void deleteStudent(String name) {
        String sql = "DELETE FROM students WHERE name = ?";

        try (Connection conn = Making_Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) deleted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        deleteStudent("ALice");
    }
}

