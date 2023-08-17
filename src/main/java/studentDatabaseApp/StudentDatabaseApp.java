package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

//        Ask how many users we want to add
        System.out.println("How many students you want to add?");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

//        Create n number of new students
        for (int i = 0; i < numberOfStudents; i++) {
//            String name = "student" + i;
            Student name = new Student();
        }

    }
}
