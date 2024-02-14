import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDepartementChecker {
    //private static Map<String, String[]> departmentCourses = new HashMap<>();: 
    //This line declares a static HashMap called departmentCourses that maps department 
    //names to arrays of course names.

    public static Map<String, String> studentDepartements = new HashMap<>();
    public static Map<String, String[]> departementCourses = new HashMap<>();

//static { ... }: This is a static initialization block, which is executed when 
//the class is loaded into memory.
    static{
    // Dummy data for IDs and departments
    studentDepartements.put("1234","Account");studentDepartements.put("5678","IT");

    // Dummy data for courses
    departementCourses.put("Account",new String[]{"Financial Accounting","Management Accounting"});departementCourses.put("IT",new String[]{"Introduction to programming","Database Management"});}

    public static String checkStudentDepartement(String studentId) {
        return studentDepartements.get(studentId);
    }

    public static String[] getCoursesForDepartement(String departement) {
        return departementCourses.get(departement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student ID: ");
        String studentId = scanner.nextLine();

        String department = checkStudentDepartement(studentId);
        if (department != null) {
            System.out.println("You're in the " + department + " department.");
            if (department.equals("IT")) {
                String[] courses = getCoursesForDepartement(department);
                if (courses != null && courses.length > 0) {
                    System.out.println("You are taking " + courses[0] + " this semester.");
                } else {
                    System.out.println("No course available for the IT department");
                }
            } else {
                System.out.println("Please go to the registrar's office for the registration.");
            }
        } else {
            System.out.println("Invalid student Id. Please try again");
        }
        scanner.close();
    }
}