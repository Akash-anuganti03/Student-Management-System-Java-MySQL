import java.util.*;
import java.sql.*;
public class search {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "95021"
            );
            String sql = "SELECT * FROM students WhERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String branch = rs.getString("branch");
                int age = rs.getInt("age");
                System.out.println(id + " " + name + " " + branch + " " + age);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
