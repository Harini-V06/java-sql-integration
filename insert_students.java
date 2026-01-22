import java.sql.Connection;
import java.sql.PreparedStatement;

public class insert_students {
    public static void insertStudent(String name, int age, String email) {
        // the only place where the table name matters
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";

        try (Connection conn = Making_Connection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Optional: testing the insert
    public static void main(String[] args) {
        insertStudent("Alice", 20, "alice@example.com");
        insertStudent("Kim", 26, "kim@example.com");
        insertStudent("John", 30, "John@example.com");
        insertStudent("Jack", 25, "Jack@example.com");
        insertStudent("Sarah", 34, "Sarah@example.com");
        insertStudent("Sam", 23, "Sam@example.com");
        insertStudent("Harry", 24, "Harry@example.com");
        insertStudent("Mia", 27, "Mia@example.com");


    }
}
