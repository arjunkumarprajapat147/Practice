/*
 * Practice 09: Multiplication Table
 * Task: Print the table of a number using a for loop.
 * Author: Arjun Kumar
 * Run: javac Practice09.java && java Practice09
 */
import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
