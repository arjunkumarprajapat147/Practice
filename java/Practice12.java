/*
 * Practice 12: Prime Number
 * Task: Check whether a number is prime.
 * Author: Arjun Kumar
 * Run: javac Practice12.java && java Practice12
 */
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        System.out.println(n + (isPrime ? " is Prime" : " is Not Prime"));
    }
}
