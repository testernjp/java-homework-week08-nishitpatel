package printprogramme4;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) between numbers 1 to 100
 */
public class Programme_09_FibonacciSeries {
    // Method to generate and print Fibonacci numbers between 1 to 100
    public static void printFibonacciNumbers(int limit) {
        int prev = 0;
        int current = 1;
        System.out.println("Fibonacci numbers between 1 and " + limit + ":");
        while (current <= limit) {
            System.out.print(current + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        int limit = 100;
        printFibonacciNumbers(limit);
    }
}
