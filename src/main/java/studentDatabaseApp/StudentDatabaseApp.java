package studentDatabaseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabaseApp {


    public static void main(String[] args) {

//        Ask how many users we want to add
        System.out.print("How many students do you want to add? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        List<Student> studentList = new ArrayList<>(numberOfStudents);
//        Create n number of new students
        for (int i = 0; i < numberOfStudents; i++) {
            Student student = new Student();
            studentList.add(student);
            System.out.println(student.showInfo());
        }
        scanner.close();

        for (Student s : studentList) {
            System.out.println();
            System.out.println(s.showInfo());
        }
    }
}
