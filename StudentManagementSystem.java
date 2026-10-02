import java.util.ArrayList;

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Sude");
        students.add("Fatma");
        students.add("Seyma");

        System.out.println("Does the list contain Sude? : " + students.contains("Sude"));

        System.out.println("Removed student: " + students.remove(0));

        System.out.println("Updated student: " + students.set(1, "Sude"));

        System.out.println("Current number of students: " + students.size());

        System.out.println("\nStudents:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}