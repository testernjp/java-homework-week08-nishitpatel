package printprogramme4;
/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class Programme_11_EvenDigitSum {
    // Method to calculate the sum of even digits within a number
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        int evenDigitSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit; // Add even digits to the sum
            }
            number /= 10;
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of even digits: ");
        int number = scanner.nextInt();
        scanner.close();
        int result = getEvenDigitSum(number);
        if (result == -1) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            System.out.println("The sum of even digits is: " + result);
        }
    }
}
