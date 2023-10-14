//Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.Random;
import java.util.Scanner;

public class task1g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        int totalScore = 0; // Initialize the total score

        while (true) {
            int score = playGame(scanner);
            totalScore += score; // Update the total score

            System.out.println("Your current score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing! Your total score is " + totalScore + ". Goodbye.");
                break;
            }
        }

        // Close the Scanner
        scanner.close();
    }

    public static int playGame(Scanner scanner) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("I have generated a number between " + min + " and " + max + ". Try to guess it!");

        int numberOfTries = 0;
        int maxAttempts = 5; // Set the maximum number of attempts

        while (numberOfTries < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
                System.out.println("It took you " + numberOfTries + " tries.");
                return maxAttempts - numberOfTries; // Return the score based on attempts remaining
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try a higher number.");
            } else {
                System.out.println("Your guess is too high. Try a lower number.");
            }

            if (numberOfTries < maxAttempts) {
                System.out.println("You have " + (maxAttempts - numberOfTries) + " attempts remaining.");
            } else {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
                return 0; // Return 0 score for this round
            }
        }
        return 0; // Return 0 score for this round (if not guessed correctly)
    }
}
