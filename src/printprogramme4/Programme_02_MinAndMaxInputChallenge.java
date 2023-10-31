package printprogramme4;

import java.util.Scanner;

/**
 * Java program that reads the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered. Before the user enters the number, print the message "Enter number:"
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge
 */
public class Programme_02_MinAndMaxInputChallenge {
    // Method to find and print minimum and maximum numbers from the user input
    public static void findMinAndMax() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // Set initial min value to maximum possible integer
        int max = Integer.MIN_VALUE; // Set initial max value to minimum possible integer
        System.out.println("Enter desired number below and to exit the loop enter a negative number");
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < 0) {
                    break; // Break out of the loop if a negative number is entered
                }
                // Update min and max values
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
            scanner.nextLine(); // Consume the newline character left by nextInt()
        }
        // Print the minimum and maximum numbers
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMax();
    }
}
