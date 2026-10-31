/*
 * Practice 06: Even or Odd
 * Task: Check if a number is even or odd.
 * Author: Arjun Kumar
 * Run: javac Practice06.java && java Practice06
 */
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println(n + " is Even");
        else System.out.println(n + " is Odd");
    }
}
