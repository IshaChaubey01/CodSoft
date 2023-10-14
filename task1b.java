import java.util.Random;
import java.util.Scanner;

public class task1b {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between " + min + " and " + max + ". Try to guess it!");

        int numberOfTries = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
                System.out.println("It took you " + numberOfTries + " tries.");
                break; // Exit the loop when the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try a higher number.");
            } else {
                System.out.println("Your guess is too high. Try a lower number.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}