import java.sql.*;
import java.util.Scanner;

public class StudentDAO {

    static Scanner sc = new Scanner(System.in);

    // ADD STUDENT
    public static void addStudent() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Branch: ");
            String branch = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String sql =
                    "INSERT INTO students VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, branch);
            ps.setInt(4, age);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW ALL STUDENTS
    public static void viewStudents() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("branch") + " " +
                                rs.getInt("age")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SEARCH STUDENT
    public static void searchStudent() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            String sql =
                    "SELECT * FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("branch") + " " +
                                rs.getInt("age")
                );

            } else {

                System.out.println("Student Not Found");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE STUDENT
    public static void updateStudent() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Name: ");
            String name = sc.next();

            System.out.print("Enter New Branch: ");
            String branch = sc.next();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();

            String sql =
                    "UPDATE students SET name=?, branch=?, age=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, branch);
            ps.setInt(3, age);
            ps.setInt(4, id);

            int rows =
                    ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student Updated Successfully"
                );

            } else {

                System.out.println(
                        "Student Not Found"
                );
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE STUDENT
    public static void deleteStudent() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            String sql =
                    "DELETE FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows =
                    ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student Deleted Successfully"
                );

            } else {

                System.out.println(
                        "Student Not Found"
                );
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
