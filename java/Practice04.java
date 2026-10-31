/*
 * Practice 04: Add Two Numbers
 * Task: Take two numbers and print their sum.
 * Author: Arjun Kumar
 * Run: javac Practice04.java && java Practice04
 */
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        double a = sc.nextDouble();
        System.out.print("Second number: ");
        double b = sc.nextDouble();
        System.out.println("Sum = " + (a + b));
    }
}
