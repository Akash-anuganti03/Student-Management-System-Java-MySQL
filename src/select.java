import java.util.*;
import java.sql.*;
public class select {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "95021"
            );
            String sql = "SELECT * FROM students WHERE id = ?";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("branch") + " " +
                                rs.getInt("age")
                );

            } else {

                System.out.println("Student not found");

            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
