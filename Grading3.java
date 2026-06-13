
import java.util.Scanner;

class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public String assignGrade() {
        double average = calculateAverage();

        int category;

        if (average >= 90) {
            category = 1;
        } else if (average >= 75) {
            category = 2;
        } else if (average >= 60) {
            category = 3;
        } else if (average >= 50) {
            category = 4;
        } else {
            category = 5;
        }

        switch (category) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            default:
                return "F";
        }
    }

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

public class Grading3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter Marks:");

        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, marks);

        student.displayDetails();

        sc.close();
    }
}
