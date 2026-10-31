/*
 * Java Practice - Arjun Kumar
 * 20 solved programs in one file.
 * Run: javac Practice.java && java Practice   (then choose a number)
 * Unsolved practice questions are at the bottom of this file.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    // menu input byte-by-byte so each program's own Scanner gets the rest
    static String readLine() throws Exception {
        StringBuilder s = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != -1 && ch != '\n') s.append((char) ch);
        return s.toString();
    }

    public static void main(String[] args) throws Exception {
        String[] titles = {"Hello World", "Variables", "Input & Output", "Add Two Numbers", "Simple Calculator", "Even or Odd", "Largest of Three", "Grade Calculator", "Multiplication Table", "Sum of N Numbers", "Factorial", "Prime Number", "Fibonacci Series", "Reverse a Number", "Palindrome String", "Count Vowels", "Array Operations", "Methods", "HashMap - Student Marks", "Number Guessing Game"};
        for (int i = 0; i < titles.length; i++) System.out.println((i + 1) + " - " + titles[i]);
        System.out.print("Kaunsa program chalana hai (1-20): ");
        int c = Integer.parseInt(readLine().trim());
        switch (c) {
            case 1: Practice01.main(args); break;
            case 2: Practice02.main(args); break;
            case 3: Practice03.main(args); break;
            case 4: Practice04.main(args); break;
            case 5: Practice05.main(args); break;
            case 6: Practice06.main(args); break;
            case 7: Practice07.main(args); break;
            case 8: Practice08.main(args); break;
            case 9: Practice09.main(args); break;
            case 10: Practice10.main(args); break;
            case 11: Practice11.main(args); break;
            case 12: Practice12.main(args); break;
            case 13: Practice13.main(args); break;
            case 14: Practice14.main(args); break;
            case 15: Practice15.main(args); break;
            case 16: Practice16.main(args); break;
            case 17: Practice17.main(args); break;
            case 18: Practice18.main(args); break;
            case 19: Practice19.main(args); break;
            case 20: Practice20.main(args); break;
            default: System.out.println("1 se 20 ke beech number do");
        }
    }

    /*
     * Practice 01: Hello World
     * Task: Print 'Hello, World!' and your name.
     * Author: Arjun Kumar
     */
    static class Practice01 {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            System.out.println("My name is Arjun Kumar");
        }
    }

    /*
     * Practice 02: Variables
     * Task: Store name, age and city in variables and print them.
     * Author: Arjun Kumar
     */
    static class Practice02 {
        public static void main(String[] args) {
            String name = "Arjun";
            int age = 20;
            String city = "Pali";
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        }
    }

    /*
     * Practice 03: Input & Output
     * Task: Take the user's name as input and greet them.
     * Author: Arjun Kumar
     */

    static class Practice03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "! Welcome to Java.");
        }
    }

    /*
     * Practice 04: Add Two Numbers
     * Task: Take two numbers and print their sum.
     * Author: Arjun Kumar
     */

    static class Practice04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("First number: ");
            double a = sc.nextDouble();
            System.out.print("Second number: ");
            double b = sc.nextDouble();
            System.out.println("Sum = " + (a + b));
        }
    }

    /*
     * Practice 05: Simple Calculator
     * Task: Do +, -, *, / on two numbers.
     * Author: Arjun Kumar
     */

    static class Practice05 {
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

    /*
     * Practice 06: Even or Odd
     * Task: Check if a number is even or odd.
     * Author: Arjun Kumar
     */

    static class Practice06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) System.out.println(n + " is Even");
            else System.out.println(n + " is Odd");
        }
    }

    /*
     * Practice 07: Largest of Three
     * Task: Find the largest of three numbers.
     * Author: Arjun Kumar
     */

    static class Practice07 {
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

    /*
     * Practice 08: Grade Calculator
     * Task: Print grade from marks (A/B/C/D/F).
     * Author: Arjun Kumar
     */

    static class Practice08 {
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

    /*
     * Practice 09: Multiplication Table
     * Task: Print the table of a number using a for loop.
     * Author: Arjun Kumar
     */

    static class Practice09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }

    /*
     * Practice 10: Sum of N Numbers
     * Task: Find the sum of 1 to N using a while loop.
     * Author: Arjun Kumar
     */

    static class Practice10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            int total = 0, i = 1;
            while (i <= n) {
                total += i;
                i++;
            }
            System.out.println("Sum of 1 to " + n + " = " + total);
        }
    }

    /*
     * Practice 11: Factorial
     * Task: Find the factorial of a number.
     * Author: Arjun Kumar
     */

    static class Practice11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }

    /*
     * Practice 12: Prime Number
     * Task: Check whether a number is prime.
     * Author: Arjun Kumar
     */

    static class Practice12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            boolean isPrime = n > 1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) { isPrime = false; break; }
            }
            System.out.println(n + (isPrime ? " is Prime" : " is Not Prime"));
        }
    }

    /*
     * Practice 13: Fibonacci Series
     * Task: Print the first N Fibonacci numbers.
     * Author: Arjun Kumar
     */

    static class Practice13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many terms? ");
            int n = sc.nextInt();
            long a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }

    /*
     * Practice 14: Reverse a Number
     * Task: Reverse the digits of a number.
     * Author: Arjun Kumar
     */

    static class Practice14 {
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

    /*
     * Practice 15: Palindrome String
     * Task: Check if a word reads the same backwards.
     * Author: Arjun Kumar
     */

    static class Practice15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = sc.nextLine().toLowerCase();
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) System.out.println(word + " is a Palindrome");
            else System.out.println(word + " is not a Palindrome");
        }
    }

    /*
     * Practice 16: Count Vowels
     * Task: Count vowels in a sentence.
     * Author: Arjun Kumar
     */

    static class Practice16 {
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

    /*
     * Practice 17: Array Operations
     * Task: Find sum, max, min and average of an array.
     * Author: Arjun Kumar
     */

    static class Practice17 {
        public static void main(String[] args) {
            int[] nums = {12, 45, 7, 23, 56, 89, 34};
            int sum = 0, max = nums[0], min = nums[0];
            for (int x : nums) {
                sum += x;
                if (x > max) max = x;
                if (x < min) min = x;
            }
            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Sum: " + sum);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + (double) sum / nums.length);
            Arrays.sort(nums);
            System.out.println("Sorted: " + Arrays.toString(nums));
        }
    }

    /*
     * Practice 18: Methods
     * Task: Write methods for area of circle and rectangle.
     * Author: Arjun Kumar
     */
    static class Practice18 {

        static double circleArea(double r) {
            return Math.PI * r * r;
        }

        static double rectangleArea(double l, double w) {
            return l * w;
        }

        public static void main(String[] args) {
            System.out.printf("Circle (r=5): %.2f%n", circleArea(5));
            System.out.println("Rectangle (4x6): " + rectangleArea(4, 6));
        }
    }

    /*
     * Practice 19: HashMap - Student Marks
     * Task: Store student marks in a HashMap and find the topper.
     * Author: Arjun Kumar
     */

    static class Practice19 {
        public static void main(String[] args) {
            HashMap<String, Integer> marks = new HashMap<>();
            marks.put("Arjun", 85);
            marks.put("Ravi", 72);
            marks.put("Priya", 91);
            marks.put("Amit", 64);
            String topper = "";
            int best = -1;
            for (Map.Entry<String, Integer> e : marks.entrySet()) {
                System.out.println(e.getKey() + " : " + e.getValue());
                if (e.getValue() > best) { best = e.getValue(); topper = e.getKey(); }
            }
            System.out.println("Topper: " + topper + " with " + best);
        }
    }

    /*
     * Practice 20: Number Guessing Game
     * Task: Guess the secret number with hints.
     * Author: Arjun Kumar
     */

    static class Practice20 {
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
}

/*
 * JAVA PRACTICE QUESTIONS (Unsolved)
 * Author: Arjun Kumar
 * Instructions: Har question ki alag class/file banao (jaise Q01.java). Pehle khud try karo!
 * 
 * --- LEVEL 1: BASICS ---
 * Q1.  Take a number and print its square and cube.
 * Q2.  Convert temperature from Celsius to Fahrenheit.  (F = C * 9/5 + 32)
 * Q3.  Calculate area and circumference of a circle (use Math.PI).
 * Q4.  Swap two numbers using a third variable, then without it.
 * Q5.  Calculate simple interest.  (SI = P * R * T / 100)
 * 
 * --- LEVEL 2: CONDITIONS ---
 * Q6.  Check whether a year is a leap year or not.
 * Q7.  Use switch-case to print the day name from a number (1 = Monday ... 7 = Sunday).
 * Q8.  Check whether a number is positive, negative or zero.
 * Q9.  Find the largest of two numbers using the ternary operator.
 * Q10. Check whether a character is an uppercase letter, lowercase letter, digit or symbol.
 * 
 * --- LEVEL 3: LOOPS ---
 * Q11. Print numbers from 1 to 50 that are divisible by both 3 and 5.
 * Q12. Find the sum of digits of a number.
 * Q13. Check whether a number is a palindrome number.  (121, 1331)
 * Q14. Print this pattern for n = 4:
 *         1
 *         1 2
 *         1 2 3
 *         1 2 3 4
 * Q15. Print all prime numbers between 1 and 100.
 * 
 * --- LEVEL 4: ARRAYS & STRINGS ---
 * Q16. Find the sum and average of elements of an array.
 * Q17. Search an element in an array (linear search).
 * Q18. Sort an array using bubble sort (without Arrays.sort).
 * Q19. Count vowels, consonants and spaces in a string.
 * Q20. Add two 2x2 matrices.
 * 
 * --- LEVEL 5: OOP ---
 * Q21. Create a class Student with name, roll no and marks; display details using a method.
 * Q22. Create a class Rectangle with a constructor and a method area().
 * Q23. Show method overloading: add(int, int) and add(double, double).
 * Q24. Show inheritance: class Animal -> class Dog with a sound() method.
 * Q25. Make a BankAccount class with deposit(), withdraw() and getBalance() (no negative balance allowed).
 */
