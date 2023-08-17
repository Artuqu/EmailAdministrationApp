package studentDatabaseApp;

public class Course {


    private int name;

    private String courseName() {
        return switch (name) {
            case 0 -> "History";
            case 1 -> "Mathematics";
            case 2 -> "English";
            case 3 -> "Chemistry";
            default -> "Computer Science";
        };
    }
    private static double costOfCourse = 600;


}
