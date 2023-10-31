package printprogramme4;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg. Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

import java.util.Scanner;

public class Programme_06_NumberTriangle {
    // Method to print a number triangle pattern
    public static void printNumberTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int number = scanner.nextInt();
        printNumberTriangle(number);
        scanner.close();
    }
}
