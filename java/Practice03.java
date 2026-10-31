/*
 * Practice 03: Input & Output
 * Task: Take the user's name as input and greet them.
 * Author: Arjun Kumar
 * Run: javac Practice03.java && java Practice03
 */
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}
