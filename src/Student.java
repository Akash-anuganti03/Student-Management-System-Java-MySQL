import java.util.*;
public class Student {
    int id;
    String name;
    String branch;
    int age;

    Student(int id, String name, String branch, int age) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.age = age;
    }
    static void addStudent( ArrayList<Student> students,Scanner sc){
        System.out.println("Enter the id of the student");
        int id = sc.nextInt();
        System.out.println("Enter the name of the student");
        String name = sc.next();
        System.out.println("Enter the branch of the student");
        String branch = sc.next();
        System.out.println("Enter the age of the student");
        int age = sc.nextInt();
        students.add(new Student(id, name, branch, age));
        System.out.println("the student record succes fully added");

    }
    static void view( ArrayList<Student> students){
        if (students.isEmpty()) {
        System.out.println("no recordss");
        return;
    }
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
        }
    }
    static void search( ArrayList<Student> students,Scanner sc){
        //--> for searching student
        System.out.println("Enter the student u (a) want to search");
        int search = sc.nextInt();
        boolean searchfound = false;
        for (Student s : students) {
            if (search == s.id) {
                System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
                searchfound = true;
                break;
            }
        }
        if (!searchfound) {
            System.out.println("not found");
        }

    }
    static void delete( ArrayList<Student> students,Scanner sc){
        //-->delete data
        System.out.println("Enter the student id u (a) want to delete");
        int delete = sc.nextInt();
        boolean deletefound = false;
        for (int i = 0; i < students.size(); i++) {
            if (delete == students.get(i).id) {
                students.remove(i);
                System.out.println("the student record at the index is deleted" + i);
                deletefound = true;
                break;
            }

        }
        if (!deletefound) {
            System.out.println("no such id exist to delete");
        }

    }
    static void update( ArrayList<Student> students,Scanner sc){
        // -->updatefeature
        System.out.println("Enter the student id u  want to update");
        int update = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (update == students.get(i).id) {
                System.out.println("enter name u want to modify");
                String upname = sc.next();
                students.get(i).name = upname;
                System.out.println("enter branch you want to modify");
                String upbranch = sc.next();
                students.get(i).branch = upbranch;
                System.out.println("enter age you want to modify");
                int upage = sc.nextInt();
                students.get(i).age = upage;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }

    }
    static void showMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. View");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("6. Exit");
    }
    static void seedData(ArrayList<Student> students){
    students.add(new Student(101, "akash", "cseAiml", 20));
    students.add(new Student(102, "head", "cse", 21));
    students.add(new Student(103, "bhuvi", "csm", 22));}
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        seedData(students);
        Scanner sc = new Scanner(System.in);
        while (true) {

            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(students,sc);
                    break;

                case 2: //view
                    view(students);
                    break;

                case 3:
                    search(students,sc);
                    break;

                case 4:
                    update(students,sc);
                    break;

                case 5:
                    //-->delete data
                  delete(students,sc);
                    break;

                case 6: // Exit
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}

















        //  student t = new student();
//        student s2 = new student();
//        t.id = 101;
//        t.name = "Akash";
//        t.branch = "CSE-AIML";
//        t.age = 21;
//        System.out.println(t.id + " " + t.name + " " + t.branch + " " + t.age);
//        s2.id = 102;
//        s2.name = "Rithwik";
//        s2.branch = "CSE-AIML";
//        s2.age = 22;
//        System.out.println(s2.id + " " + s2.name + " " + s2.branch + " " + s2.age);
//        ArrayList<student> students = new ArrayList<>();
//        students.add(new student(101, "akash", "cseAiml", 20));
//        students.add(new student(102, "head", "cse", 21));
//        students.add(new student(103, "bhuvi", "csm", 22));
//
//        students.add(t);
//        students.add(s2);
//      System.out.println(students.size());
//        for (student s : students) {
//            System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
//        }

        //--> for searching student

  //      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the student u (a) want to search");
//        int search = sc.nextInt();
//        int flag = 0;
//        for (student s : students) {
//            if (search == s.id) {
//                System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
//                flag = 1;
//                break;
//            }
//        }
//        if (flag == 0) {
//            System.out.println("not found");
//        }

        //-->delete data

//        students.remove(1);
//        for(student s : students){
//            System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
//        }

//        System.out.println("Enter the student id u (a) want to delete");
//        int delete = sc.nextInt();
//        boolean found = false;
//        for (int i =0 ;i<students.size();i++) {
//            if (delete == students.get(i).id) {
//                students.remove(i);
//                System.out.println("the student record at the index is deleted" +i);
//                found =true;
//                break;
//            }
//
//        }if(!found){
//            System.out.println("no such id exist to delete");}

       // -->updatefeature
//        System.out.println("Enter the student id u  want to update");
//        int update = sc.nextInt();
//        for (int i =0 ;i<students.size();i++) {
//            if(update == students.get(i).id){
//                System.out.println("enter name u want to modify");
//                String name = sc.next();
//                        students.get(i).name = name;
//                System.out.println("enter branch you want to modify");
//                String branch = sc.next();
//                        students.get(i).branch = branch;
//                System.out.println("enter age you want to modify");
//                int age = sc.nextInt();
//                        students.get(i).age = age;
//            }
//        }
//        for(student s : students){
//       System.out.println(s.id + " " + s.name + " " + s.branch + " " + s.age);
//        }}




