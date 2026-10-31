/*
 * Practice 08: Grade Calculator
 * Task: Print grade from marks (A/B/C/D/F).
 * Author: Arjun Kumar
 * Run: javac Practice08.java && java Practice08
 */
import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 80) grade = 'A';
        else if (marks >= 60) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}
