/*
 * Practice 13: Fibonacci Series
 * Task: Print the first N Fibonacci numbers.
 * Author: Arjun Kumar
 * Run: javac Practice13.java && java Practice13
 */
import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms? ");
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
