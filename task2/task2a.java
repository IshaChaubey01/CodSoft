//Input: Take marks obtained (out of 100) in each subject.

import java.util.Scanner;

public class task2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Marks Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to keep track of total marks and average
        double totalMarks = 0.0;
        double averageMarks;

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

        // Calculate the average marks
        averageMarks = totalMarks / numSubjects;

        // Display the average marks
        System.out.println("Average marks obtained: " + averageMarks);

        // Close the Scanner
        scanner.close();
    }
}
