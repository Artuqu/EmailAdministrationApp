package studentDatabaseApp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentDatabaseApp {

    static String name = "";


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

//        Ask how many users we want to add
        System.out.print("How many students do you want to add? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
//        Create n number of new students
        for (int i = 0; i < numberOfStudents; i++) {
            name = "student" + i;
            Student name = new Student();
            studentList.add(name);
        }
        scanner.close();
//        for (Student s : studentList) {
//            System.out.println(s);
//        }

    }
}
