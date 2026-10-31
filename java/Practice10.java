/*
 * Practice 10: Sum of N Numbers
 * Task: Find the sum of 1 to N using a while loop.
 * Author: Arjun Kumar
 * Run: javac Practice10.java && java Practice10
 */
import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int total = 0, i = 1;
        while (i <= n) {
            total += i;
            i++;
        }
        System.out.println("Sum of 1 to " + n + " = " + total);
    }
}
