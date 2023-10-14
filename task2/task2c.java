//Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage

import java.util.Scanner;

public class task2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Average Percentage Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to keep track of total marks and total number of subjects
        double totalMarks = 0.0;

        // Loop to input marks for each subject and calculate total marks
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

        // Calculate the average percentage
        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

        // Display the average percentage
        System.out.println("Average percentage obtained: " + averagePercentage + "%");

        // Close the Scanner
        scanner.close();
    }
}
