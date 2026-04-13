
import java.util.Scanner;
// Student class represents a single student

class Student {

// Variables to store student name and marks
    String name;
    int[] marks;

// Constructor to initialize name and marks
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
// Calculate and return average
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double average = (double) sum / marks.length;
        return average;
    }

    public char assignGrade() {
// Method to assign grade based on average
        double average = calculateAverage();
// Conditions to decide grade
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
// Method to display student details

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name = " + name);
        System.out.print("Marks = ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("Average Marks = " + calculateAverage());
        System.out.println("Grade = " + assignGrade());
    }
}

public class Grading {

    public static void main(String[] args) {
// Scanner object for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name = ");
        String name = sc.nextLine();
        System.out.print("Enter number of subject = ");
        int n = sc.nextInt();

        // Create array for marks
        int[] marks = new int[n];
// Take marks input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

// Craete Student Object
        Student s1 = new Student(name, marks);
// Display student details        
        s1.display();
    }
}
// Thee Output is =
// Enter student name = Rahul
// Enter number of subject = 4
// Enter mark 1: 85
// Enter mark 2: 78
// Enter mark 3: 90
// Enter mark 4: 88

// --- Student Result ---
// Name = Rahul
// Marks = 85 78 90 88 Average Marks = 85.25
// Grade = B
