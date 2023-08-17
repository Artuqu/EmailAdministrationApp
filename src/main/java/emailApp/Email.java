package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //    Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email created for " + firstName + " " + lastName);
        this.department = setDepartment();
//        System.out.println("Department is " + department);

//        Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Random password is: " + password);

//        Combine the elements to generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email adress is: " + email);
    }

    //    Ask for the department
    private String setDepartment() {
        System.out.println("Hi " + firstName);
        System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
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

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }


//    Set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


//    Change the password

    public void changePassword(String password) {
        this.password = password;
    }


//    Get the name, email and mailbox capacity


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String displayFullInfo() {
        return "DISPLAY NAME: " + getFullName() + "\nEMAIL: " + email + "\nMAILBOX CAPACITY: " + mailBoxCapacity +"MB";
    }
}
