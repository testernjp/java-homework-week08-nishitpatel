package printprogramme4;
/**
 *Write a program in Java to display the pattern like a diamond. Using While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */

import java.util.Scanner;

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get  the number of rows for the diamond pattern  from the user
        System.out.println("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();
        // Call the printDiamondPattern method to print the diamond pattern printDiamondPattern
        printDiamondPattern(rows);
        // Close the scanner
        scanner.close();
    }

    // Method to print a diamond pattern with the given number of rows
    public static void printDiamondPattern(int rows) {
        int i = 1;
        int space = rows - 1;
        // Print the upper half of the diamond pattern
        while (i <= rows) {
            int j = 1;
            // Print spaces before the stars
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line
            System.out.println();
            space--;
            i++;
        }
        // Reset variables for the lower half of the diamond pattern
        i = rows - 1;
        space = 1;
        // Print the lower half of the diamond pattern
        while (i >= 1) {
            int j = 1;

            // Print spaces before the stars
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // Print stars
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            // Move to the next line
            System.out.println();
            space++;
            i--;
        }
    }
}