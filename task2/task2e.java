//Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;

public class task2e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Result Display!");
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

        // Assign grades based on the average percentage
        String grade = assignGrade(averagePercentage);

        // Display results
        System.out.println("Results:");
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage obtained: " + averagePercentage + "%");
        System.out.println("Grade assigned: " + grade);

        // Close the Scanner
        scanner.close();
    }

    // Function to assign grades based on the average percentage
    public static String assignGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
