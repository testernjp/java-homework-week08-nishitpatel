package printprogramme4;

import java.util.Scanner;

/**
 * Java Program to read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x: where x represents the count,
 * i.e. 1, 2, 3, 4, etc. For example, the first message printed to the user would be "Enter number #1:", the next Enter number
 * #2:, and so on.
 * Hint:
 * Use a while loop.
 * Use a counter variable for counting valid numbers.
 * Close the scanner after you don't need it anymore.
 * Create a class with the name ReadingUserInputChallenge
 */
public class Programme_01_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count < 10) {
            count++;
            // Prompt the user to enter a number
            System.out.println("Enter number #" + (count + 0) + ": ");
            if (hasNextInt(scanner)) {
                int number = nextInt(scanner);
                sum += number;
            } else {
                System.out.println("Invalid Number. Please enter a valid integer.");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of the entered numbers: " + sum);
    }
    // Custom hasNextInt() method with input validation
    public static boolean hasNextInt(Scanner scanner) {
        return scanner.hasNextInt();
    }
    // Custom nextInt() method to read an integer
    public static int nextInt(Scanner scanner) {
        return scanner.nextInt();
    }
}
