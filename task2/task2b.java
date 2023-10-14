//Calculate Total Marks: Sum up the marks obtained in all subjects.

import java.util.Scanner;

public class task2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Total Marks Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to keep track of total marks
        double totalMarks = 0.0;

        // Loop to input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            // Validate that marks are within the valid range
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return; // Exit the program if invalid marks are entered
            }

            totalMarks += marks;
        }

        // Display the total marks
        System.out.println("Total marks obtained: " + totalMarks);

        // Close the Scanner
        scanner.close();
    }
}

