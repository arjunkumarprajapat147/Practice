/*
 * Practice 16: Count Vowels
 * Task: Count vowels in a sentence.
 * Author: Arjun Kumar
 * Run: javac Practice16.java && java Practice16
 */
import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().toLowerCase();
        int count = 0;
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Vowels: " + count);
    }
}
