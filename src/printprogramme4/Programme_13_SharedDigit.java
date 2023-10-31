package printprogramme4;
/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */

import java.util.Scanner;

public class Programme_13_SharedDigit {
    // Method to check if two numbers have a shared digit
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // Check if either number is not within the  range
        }
        int firstDigitNum1 = num1 / 10; // Get the first digit if num1
        int secondDigitNum1 = num1 % 10; // Get the second digit if num1
        int firstDigitNum2 = num2 / 10; // Get the first digit of num2
        int secondDigitNum2 = num2 % 10; // Get the second digit of num2
        // Check if any digit of num1 is equal to any digit of num2
        return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 ||
                secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == secondDigitNum2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers (each between 10 and 99) separated by a space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        if (hasSharedDigit(num1, num2)) {
            System.out.println("The numbers " + num1 + " and " + num2 + " have a shared digit.");
        } else {
            System.out.println("The numbers " + num1 + " and " + num2 + " do not have a shared digit.");
        }
    }
}
