/*
 * Practice 15: Palindrome String
 * Task: Check if a word reads the same backwards.
 * Author: Arjun Kumar
 * Run: javac Practice15.java && java Practice15
 */
import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) System.out.println(word + " is a Palindrome");
        else System.out.println(word + " is not a Palindrome");
    }
}
