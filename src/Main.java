import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Students grades mini program");
        System.out.println("Options:");
        System.out.println("1 - Insert a new student");
        System.out.println("2 - Display a student's details by ID");
        System.out.println("Press SPACE and hit Enter to stop.");

        do {
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();

            if (input.equals("1")) {
                // Insert a new student
                System.out.print("Enter student ID: ");
                int id = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter student grade (0-100): ");
                double grade = Double.parseDouble(scanner.nextLine());

                Student newStudent = new Student(id, name, grade);
                students.put(id, newStudent);
                System.out.println("Student added successfully!\n");

            } else if (input.equals("2")) {
                // Display student details
                System.out.print("Enter student ID to display: ");
                int id = Integer.parseInt(scanner.nextLine());

                if (students.containsKey(id)) {
                    System.out.println(students.get(id).toString());
                } else {
                    System.out.println("Student with ID " + id + " not found.");
                }

            } else if (!input.trim().isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (!input.trim().isEmpty()); // Exit loop if input is empty (space and Enter)

        System.out.println("Program terminated.");
        scanner.close();
    }
}
