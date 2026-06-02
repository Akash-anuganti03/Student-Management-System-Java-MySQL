import java.sql.*;
import java.util.*;

public class update {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "95021"
            );

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Student ID to update:");
            int id = sc.nextInt();

            System.out.println("Enter new name:");
            String name = sc.next();

            System.out.println("Enter new branch:");
            String branch = sc.next();

            System.out.println("Enter new age:");
            int age = sc.nextInt();

            String sql =
                    "UPDATE students SET name=?, branch=?, age=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, branch);
            ps.setInt(3, age);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Updated Successfully");
            } else {
                System.out.println("Student ID not found");
            }

            ps.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}