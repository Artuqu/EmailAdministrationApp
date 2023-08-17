package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int defaultPasswordLength;
    private String alternateEmail;

    //    Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for " + firstName + " " + lastName);
        this.department = setDepartment();
        System.out.println("Department is " + department);

//        Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Random password is: " + password);
    }

    //    Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //    Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXVYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//    Set the mailbox capacity

//    Set the alternate email

//    Change the password

//    Get the name, email and mailbox capacity


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
}
