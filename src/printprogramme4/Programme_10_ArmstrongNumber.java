package printprogramme4;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So: 1 + 125 + 27 = 153
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }
        return originalNumber == result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isArmstrong = isArmstrongNumber(number);
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}