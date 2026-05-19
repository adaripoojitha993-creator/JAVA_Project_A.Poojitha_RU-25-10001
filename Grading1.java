
import java.util.Scanner;

class Student {

    // Private fields (Encapsulation)
    private String name;
    private int[] marks;

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    // Method to assign grade
    public String assignGrade() {
        double average = calculateAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Name: " + name);

        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
    }
}

public class Grading1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Input number of subjects
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        System.out.println("Enter Marks:");

        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object
        Student student = new Student(name, marks);

        // Display result
        student.displayDetails();

        sc.close();
    }
}

// Output
// Enter Student Name: Rahul
// Enter Number of Subjects: 4
// Enter Marks:
// Subject 1: 85
// Subject 2: 78
// Subject 3: 90
// Subject 4: 88
// Student Name: Rahul
// Marks: 85 78 90 88 
// Average: 85.25
// Grade: B
