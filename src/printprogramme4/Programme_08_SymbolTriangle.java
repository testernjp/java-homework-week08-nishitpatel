package printprogramme4;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme_08_SymbolTriangle {
    // Method to print triangle pattern using'@' symbol
    public static void symbolTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired number of row to build: ");
        int number = scanner.nextInt();
        symbolTriangle(number);
        scanner.close();
    }

}
