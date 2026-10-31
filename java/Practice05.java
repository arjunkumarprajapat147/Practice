/*
 * Practice 05: Simple Calculator
 * Task: Do +, -, *, / on two numbers.
 * Author: Arjun Kumar
 * Run: javac Practice05.java && java Practice05
 */
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) System.out.println("a / b = " + (a / b));
        else System.out.println("Cannot divide by zero");
    }
}
