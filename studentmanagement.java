import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String enrollmentNo;
    String branch;
    int semester;
    double marks;
    
    Student(String name, String enrollmentNo, String branch, int semester, double marks){
           this.name = name;
           this.enrollmentNo = enrollmentNo;
           this.marks = marks;
    
    }
    void display(){
         System.out.println("Name:" + name );
         System.out.println("Enrollment No:" + enrollmentNo);
         System.out.println("Branch:"+ branch );
         System.out.println("Semester:" + semester);
         System.out.println("Marks:" + marks);
    }
}
    public class studentmanagement{
        static ArrayList<Student>
        students = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);

        //Add STUDENT 
        static void addStudent(){
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter Enrollment No.");
            String enrollmentNo = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.print("Enter Semester:");
            int semester = sc.nextInt();

            System.out.print("Enter Marks:");
            double marks = sc.nextDouble();
                           sc.nextLine();
            
            students.add(new Student(name, enrollmentNo, branch, semester, marks));
             System.out.println("Student added sucessfully!");
        }
    // Display Students
    static void displayStudents(){
        if (students.isEmpty()){
                System.out.println("No students found.");
                return;
            }
            for (Student s : students){
                s.display();
                System.out.println("-------------------");
            }
        }

        // Search Student
        static void searchStudent() {
            System.out.print("Enter Enrollment Number to search:");
            String enrollmentNo= sc.nextLine();
            for(Student s : students){
                if (s.enrollmentNo.equals(enrollmentNo)){
                    System.out.println("Student found:");
                                s.display();
                                return;
                }
            }
            System.out.println("Student not found.");
        }

        // Update Student
        static void updateStudent(){
            System.out.print("Enter Enrollment Number to update:");
            String enrollmentNo = sc.nextLine();
            for (Student s: students){
                if(s.enrollmentNo.equals(enrollmentNo)){
                    System.out.println("Student found:");
                      s.display();
                      return;
                }
            }
            System.out.println("Student not found.");
        }
        // Update Student
        static void updatestudent(){
            System.out.print("Enter Enrolement Number to update:");
            String enrollentNo = sc.nextLine();
            for (Student s : students){
                Object enrollmentNo = null;
                if(s.enrollmentNo.equals(enrollmentNo)){

                    System.out.print("Enter New Name:");
                    s.name = sc.nextLine();

                    System.out.print("Enter new branch:");
                    s.branch = sc.nextLine();

                    System.out.print("Enter new semester:");
                    s.semester = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new marks:");
                    s.marks = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Student update successfully!");
                    return;
                }
            }
            System.out.println("Student not found.");
        }

        // delete student
        static void deleteStudent(){
            System.out.print("Enter Enrollment number to delete:");
            String enrollmentNo = sc.nextLine();
            for (Student s : students){
                if (s.enrollmentNo.equals(enrollmentNo)){
                    students.remove(s);
                    System.out.println("Student deleted successfully!");
                    return;
                }
            }
            System.out.println("Student not found.");
        }

        //Main menu
        public static void main(String[]args){
            while (true){

                        System.out.println(" STUDENT MANAGEMENT SYSTEM");
                        System.out.println("1. Add Student");
                        System.out.println("2. Display Students");
                        System.out.println("3. Search Student ");
                        System.out.println("4. Update Student ");
                        System.out.println("5. Delete Student");
                        System.out.println("6. Exit");
                        System.out.println("Enter your choice :");
                        int choice = sc.nextInt();
                        sc.nextLine();
                        switch (choice){
                            case 1 : addStudent();
                            break;
                            case 2 : displayStudents();
                            break;
                            case 3 : searchStudent();
                            break;
                            case 4 : updateStudent();
                            break;
                            case 5 : deleteStudent();
                            break;
                            case 6 :
                            System.out.println("Thank you!");
                            sc.close();
                            return;
                            default:

                            System.out.println("Invalid choice!");
                        }
                    }
                }

    private static void displayStudent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }
            
        
    
