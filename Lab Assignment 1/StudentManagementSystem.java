
import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        while (cont) { 
         System.out.println("====STUDENT MANAGEMENT SYSTEM====");
         System.out.println("1. Add Student");
         System.out.println("2. Display all Students");
         System.out.println("3. Exit");
         System.out.print("Enter Your Choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
             case 1:
                 Student s = new Student();
                 s.inputDetails(scanner);
                 students.add(s);
                 break;
             case 2:
                int n = students.size();
                for (int i = 0; i < n; i++) {
                    students.get(i).displayDetails();
                }
                break;
            case 3:
                cont = false;
                break;
             default:
                 throw new AssertionError();
         }
        }
        System.out.println("Exited");
        scanner.close();
    }
}

class Student {
    int rollno;
    String name;
    String course;
    double marks;
    char grade;

    public Student() {
        rollno = 0;
        name = "NULL";
        course = "NULL";
        marks = 0;
        grade = 'N';
    }

    public Student(int rollno, String name, String course, double marks, char grade) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    void inputDetails(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Student Roll No: ");
        rollno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Course: ");
        course = scanner.nextLine();
        System.out.print("Enter Student Marks: ");
        marks = scanner.nextDouble();
        scanner.nextLine();
        grade = calculateGrade();
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll NO: " + rollno);
        System.out.println("Student Course: " + course);
        System.out.println("Student Marks: " + marks);
        System.out.println("Student Grade: " + grade);
        System.out.println();
    }

    char calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        }
        else if (marks >= 80) {
            grade = 'B';
        }
        else if (marks >= 70) {
            grade = 'C';
        }
        else if (marks >= 50) {
            grade = 'D';
        }
        else if (marks >= 30) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        return grade;
    }
    
}