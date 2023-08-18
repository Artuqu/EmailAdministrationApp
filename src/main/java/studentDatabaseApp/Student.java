package studentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private static double costOfCourse = 600;
    private double tuitionBalance = 0;

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
        this.studentID = generateID();
        enroll();
        id++;
    }

    //    Generate an ID
    private String generateID() {
        return gradeYear + "" + id;
    }

    //    Enroll in courses
    public void enroll() {
//        Get inside a loop, user hits Q
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner scanner = new Scanner(System.in);
        String course = scanner.nextLine();
        while (!course.equals("Q")) {
            courses += "\n" + course;
            tuitionBalance += costOfCourse;
            course = scanner.nextLine();
        }
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE " + tuitionBalance);
    }

//    View balance

//    Pay Tuition

//    Show status


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentID='" + studentID + '\'' +
                ", courses='" + courses + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }
}
