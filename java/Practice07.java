/*
 * Practice 07: Largest of Three
 * Task: Find the largest of three numbers.
 * Author: Arjun Kumar
 * Run: javac Practice07.java && java Practice07
 */
import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest = " + largest);
    }
}
