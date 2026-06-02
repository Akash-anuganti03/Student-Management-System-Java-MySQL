import java.sql.*;
import java.util.*;

public class InsertStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "95021"
            );

            System.out.println("Enter id:");
            int id = sc.nextInt();

            System.out.println("Enter name:");
            String name = sc.next();

            System.out.println("Enter branch:");
            String branch = sc.next();

            System.out.println("Enter age:");
            int age = sc.nextInt();

            String sql = "INSERT INTO students VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, branch);
            ps.setInt(4, age);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
