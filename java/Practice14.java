/*
 * Practice 14: Reverse a Number
 * Task: Reverse the digits of a number.
 * Author: Arjun Kumar
 * Run: javac Practice14.java && java Practice14
 */
import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed: " + rev);
    }
}
