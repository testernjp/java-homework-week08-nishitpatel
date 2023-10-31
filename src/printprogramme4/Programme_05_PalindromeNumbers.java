package printprogramme4;
/**
 * Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes. Tip: What is a Palindrome number?
 * A palindrome number is a number which when reversed is equal to the original number.
 * For example: 121, 12321, and 1001 etc. Tip: Logic to check a palindrome number the reverse of the given number.
 * Store it in some variable, say reverse. Compare the number with the reverse. If both are the same then the number
 * is a palindrome otherwise it is not. Tip: Logic to reverse a number Declare and initialize another variable to
 * store the reverse of a number, for example reverse = 0. Extract the last digit of the given number by performing
 * the modulo division (remainder). Store the last digit to some variable say lastDigit = num % 10.
 * Increase the place value of reverse by one. To increase place value multiply the reverse variable by 10
 * e.g. reverse = reverse * 10. Add lastDigit to reverse. Since the last digit of the number is processed,
 * remove the last digit of num. To remove the last digit divide number by 10. Repeat steps until the number is
 * not equal to (or greater than) zero. A while loop would be good for this coding exercise. Tip: Be careful with
 * negative numbers. They can also be palindrome numbers. Tip: Be careful with reversing a number,
 * you will need a parameter for comparing a reversed number with the starting number (parameter)
 * NOTE: The method isPalindrome needs to be defined as public static
 */

import java.util.Scanner;

public class Programme_05_PalindromeNumbers {
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Check for negative numbers (they can also be palindrome)
        if (number < 0) {
            number = Math.abs(number); // Convert negative number to its positive counterpart
        }
        int originalNumber = number;
        int reverse = reverseNumber(number);
        // Compare the original number with its reverse
        return originalNumber == reverse;
    }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPalindromic = isPalindrome(number);
        if (isPalindromic) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
