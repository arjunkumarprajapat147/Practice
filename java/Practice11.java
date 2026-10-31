/*
 * Practice 11: Factorial
 * Task: Find the factorial of a number.
 * Author: Arjun Kumar
 * Run: javac Practice11.java && java Practice11
 */
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
