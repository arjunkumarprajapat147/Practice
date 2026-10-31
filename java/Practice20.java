/*
 * Practice 20: Number Guessing Game
 * Task: Guess the secret number with hints.
 * Author: Arjun Kumar
 * Run: javac Practice20.java && java Practice20
 */
import java.util.Random;
import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = new Random().nextInt(50) + 1;
        int tries = 0;
        System.out.println("Guess the number between 1 and 50!");
        while (true) {
            System.out.print("Your guess: ");
            int guess = sc.nextInt();
            tries++;
            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
            else { System.out.println("Correct! You got it in " + tries + " tries"); break; }
        }
    }
}
