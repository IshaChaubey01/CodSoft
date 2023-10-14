//Generate a random number within a specified range, such as 1 to 100.

import java.util.Random;

public class task1a {
    public static void main(String[] args) {
        int min = 1; // Minimum value (inclusive)
        int max = 100; // Maximum value (inclusive)

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}

