package printprogramme4;

import java.util.Scanner;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 */
public class Programme_04_DigitSumChallenge {
    // Method to calculate the sum of digits in a number
    public static int sunDigits(int number) {
        if (number < 10 || number < 0) {
            return -1; // Invalid value
        }
        int sum = 0;
        while (number > 0) {

            int digit = number % 10; // Extract the least-significant digit
            sum += digit;
            number /= 10; // Discard the least-significant digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // User enters desired number in the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sunDigits(number);
            if (result != -1) {
                System.out.println("Sum of digits: " + result);
            } else {
                System.out.println("Invalid input. Please enter a number >= 10 and not negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }
}

