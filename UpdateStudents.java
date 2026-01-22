import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudents {

    public static void updateStudentAge(String name, int newAge) {
        String sql = "UPDATE students SET age = ? WHERE name = ?";

        try (Connection conn = Making_Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, newAge);
            stmt.setString(2, name);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateStudentAge("Alice", 28);
    }
}
