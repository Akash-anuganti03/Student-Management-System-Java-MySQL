import java.util.Scanner;

public class StudentManagement1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    StudentDAO.addStudent();
                    break;

                case 2:
                    StudentDAO.viewStudents();
                    break;

                case 3:
                    StudentDAO.searchStudent();
                    break;

                case 4:
                    StudentDAO.updateStudent();
                    break;

                case 5:
                    StudentDAO.deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}