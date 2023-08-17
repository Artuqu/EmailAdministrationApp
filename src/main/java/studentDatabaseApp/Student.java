package studentDatabaseApp;

import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private List<Course> courses;
    private double tuitionBalance;

    private static int id = 1000;

//Constructor: prompt user to enter student's name and year

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter student's last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter year of grad:" +
                "\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
        id++;
        this.studentID = generateID(gradeYear);
    }

    //    Generate an ID
    private int generateID(int gradeYear) {

        return (int) (gradeYear + Math.random());
    }

//    Enroll in courses

//    View balance

//    Pay Tuition

//    Show status


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentID=" + studentID +
                ", courses=" + courses +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }
}
