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
        System.out.print("Enter student's first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter student's last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Year of grad:" +
                "\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = scanner.nextInt();
        this.studentID = generateID();
        enroll();
        payTuition();
        id++;
    }

    //    Generate an ID
    private String generateID() {
        return gradeYear + "" + id;
    }

    //    Enroll in courses
    public void enroll() {
//        Get inside a loop, user hits Q
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (2 != 0);
    }

    //    View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + this.tuitionBalance);
    }

    //    Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("How much do you want to pay now? $");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

//    Show status

    public String showInfo() {
        return
                "Name: " + firstName + " " + lastName +
                        "\nGradeYear: " + gradeYear +
                        "\nStudentID: " + studentID +
                        "\nCourses enrolled: " + courses +
                        "\nBalance: " + tuitionBalance;
    }
}
