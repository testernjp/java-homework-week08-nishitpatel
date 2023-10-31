package printprogramme4;
/**
 * Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_03_FindVowelOrConsonant {
    // Method to determine whether a character is a vowel or consonant
    public static void vowelAndConsonant(String input) {
        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Input not a letter");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        // User enters desired character in the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scanner.next();
        vowelAndConsonant(input);
        scanner.close();
    }
}
