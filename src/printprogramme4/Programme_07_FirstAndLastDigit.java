package printprogramme4;
/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */

import java.util.Scanner;

public class Programme_07_FirstAndLastDigit {
    // Method to find and sum the first and last digit of a number
    public static int sunFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers

        } else if (number == 0) {
            return 0; // Return 0 for a single-digit number (0)
        } else {
            int lastDigit = number % 10; // Get the last digit
            int firstDigit = 0;
            while (number > 0) {
                firstDigit = number % 10; // Keep updating firstDigit while extracting digits
                number /= 10;
            }
            return firstDigit + lastDigit;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of the first and last digit: ");
        int number = scanner.nextInt();
        scanner.close();
        int result = sunFirstAndLastDigit(number);
        if (result == -1) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            System.out.println("The sum of the first and last digit is: " + result);
        }
    }
}
