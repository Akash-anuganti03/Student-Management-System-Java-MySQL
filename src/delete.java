import java.sql.*;
import java.util.Scanner;

public class delete {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "95021"
            );

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Student ID to delete:");
            int id = sc.nextInt();

            String sql = "DELETE FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student ID not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}