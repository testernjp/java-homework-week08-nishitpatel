package printprogramme4;
/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Programme_15_LeftTriangleStar {
    public static void triangleStar(int number) {
        for (int i = 1; i <= number; i++) { // i loop is for number count loop
            for (int j = 1; j <= (number - i); j++) { //j loop prints spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // k loop prints *
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valid number: ");
        int number = scanner.nextInt();
        triangleStar(number);
        scanner.close();
    }
}