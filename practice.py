"""
Python Practice - Arjun Kumar
20 solved programs. Run: python practice.py and choose a number.
Unsolved practice questions are at the bottom of this file.
"""

# ============================================================
# Practice 01: Hello World
# Task: Print 'Hello, World!' and your name.
# Author: Arjun Kumar
# ============================================================
def practice_01():
    print("Hello, World!")
    print("My name is Arjun Kumar")


# ============================================================
# Practice 02: Variables
# Task: Store your name, age and city in variables and print them.
# Author: Arjun Kumar
# ============================================================
def practice_02():
    name = "Arjun"
    age = 20
    city = "Pali"
    print("Name:", name)
    print("Age:", age)
    print("City:", city)


# ============================================================
# Practice 03: Input & Output
# Task: Take the user's name as input and greet them.
# Author: Arjun Kumar
# ============================================================
def practice_03():
    name = input("Enter your name: ")
    print("Hello,", name + "! Welcome to Python.")


# ============================================================
# Practice 04: Add Two Numbers
# Task: Take two numbers from the user and print their sum.
# Author: Arjun Kumar
# ============================================================
def practice_04():
    a = float(input("First number: "))
    b = float(input("Second number: "))
    print("Sum =", a + b)


# ============================================================
# Practice 05: Simple Calculator
# Task: Do +, -, *, / on two numbers.
# Author: Arjun Kumar
# ============================================================
def practice_05():
    a = float(input("a: "))
    b = float(input("b: "))
    print("a + b =", a + b)
    print("a - b =", a - b)
    print("a * b =", a * b)
    if b != 0:
        print("a / b =", a / b)
    else:
        print("Cannot divide by zero")


# ============================================================
# Practice 06: Even or Odd
# Task: Check if a number is even or odd.
# Author: Arjun Kumar
# ============================================================
def practice_06():
    n = int(input("Enter a number: "))
    if n % 2 == 0:
        print(n, "is Even")
    else:
        print(n, "is Odd")


# ============================================================
# Practice 07: Largest of Three
# Task: Find the largest of three numbers.
# Author: Arjun Kumar
# ============================================================
def practice_07():
    a = int(input("a: "))
    b = int(input("b: "))
    c = int(input("c: "))
    if a >= b and a >= c:
        largest = a
    elif b >= c:
        largest = b
    else:
        largest = c
    print("Largest =", largest)


# ============================================================
# Practice 08: Grade Calculator
# Task: Print grade from marks (A/B/C/D/F).
# Author: Arjun Kumar
# ============================================================
def practice_08():
    marks = int(input("Enter marks (0-100): "))
    if marks >= 80:
        grade = "A"
    elif marks >= 60:
        grade = "B"
    elif marks >= 50:
        grade = "C"
    elif marks >= 40:
        grade = "D"
    else:
        grade = "F"
    print("Grade:", grade)


# ============================================================
# Practice 09: Multiplication Table
# Task: Print the table of a number using a for loop.
# Author: Arjun Kumar
# ============================================================
def practice_09():
    n = int(input("Enter a number: "))
    for i in range(1, 11):
        print(n, "x", i, "=", n * i)


# ============================================================
# Practice 10: Sum of N Numbers
# Task: Find the sum of 1 to N using a while loop.
# Author: Arjun Kumar
# ============================================================
def practice_10():
    n = int(input("Enter N: "))
    total = 0
    i = 1
    while i <= n:
        total += i
        i += 1
    print("Sum of 1 to", n, "=", total)


# ============================================================
# Practice 11: Factorial
# Task: Find the factorial of a number.
# Author: Arjun Kumar
# ============================================================
def practice_11():
    n = int(input("Enter a number: "))
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    print("Factorial of", n, "=", fact)


# ============================================================
# Practice 12: Prime Number
# Task: Check whether a number is prime.
# Author: Arjun Kumar
# ============================================================
def practice_12():
    n = int(input("Enter a number: "))
    is_prime = n > 1
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            is_prime = False
            break
    print(n, "is Prime" if is_prime else "is Not Prime")


# ============================================================
# Practice 13: Fibonacci Series
# Task: Print the first N Fibonacci numbers.
# Author: Arjun Kumar
# ============================================================
def practice_13():
    n = int(input("How many terms? "))
    a, b = 0, 1
    for _ in range(n):
        print(a, end=" ")
        a, b = b, a + b
    print()


# ============================================================
# Practice 14: Reverse a Number
# Task: Reverse the digits of a number.
# Author: Arjun Kumar
# ============================================================
def practice_14():
    n = int(input("Enter a number: "))
    rev = 0
    while n > 0:
        rev = rev * 10 + n % 10
        n //= 10
    print("Reversed:", rev)


# ============================================================
# Practice 15: Palindrome String
# Task: Check if a word reads the same backwards.
# Author: Arjun Kumar
# ============================================================
def practice_15():
    word = input("Enter a word: ").lower()
    if word == word[::-1]:
        print(word, "is a Palindrome")
    else:
        print(word, "is not a Palindrome")


# ============================================================
# Practice 16: Count Vowels
# Task: Count vowels in a sentence.
# Author: Arjun Kumar
# ============================================================
def practice_16():
    text = input("Enter a sentence: ").lower()
    count = 0
    for ch in text:
        if ch in "aeiou":
            count += 1
    print("Vowels:", count)


# ============================================================
# Practice 17: List Operations
# Task: Find sum, max, min and average of a list.
# Author: Arjun Kumar
# ============================================================
def practice_17():
    nums = [12, 45, 7, 23, 56, 89, 34]
    print("List:", nums)
    print("Sum:", sum(nums))
    print("Max:", max(nums))
    print("Min:", min(nums))
    print("Average:", round(sum(nums) / len(nums), 2))
    nums.sort()
    print("Sorted:", nums)


# ============================================================
# Practice 18: Functions
# Task: Write functions for area of circle and rectangle.
# Author: Arjun Kumar
# ============================================================
def practice_18():
    import math

    def circle_area(r):
        return math.pi * r * r

    def rectangle_area(l, w):
        return l * w

    print("Circle (r=5):", round(circle_area(5), 2))
    print("Rectangle (4x6):", rectangle_area(4, 6))


# ============================================================
# Practice 19: Dictionary - Student Marks
# Task: Store student marks in a dictionary and find the topper.
# Author: Arjun Kumar
# ============================================================
def practice_19():
    marks = {"Arjun": 85, "Ravi": 72, "Priya": 91, "Amit": 64}
    for name, m in marks.items():
        print(name, ":", m)
    topper = max(marks, key=marks.get)
    print("Topper:", topper, "with", marks[topper])


# ============================================================
# Practice 20: Number Guessing Game
# Task: Guess the secret number with hints.
# Author: Arjun Kumar
# ============================================================
def practice_20():
    import random

    secret = random.randint(1, 50)
    tries = 0
    print("Guess the number between 1 and 50!")
    while True:
        guess = int(input("Your guess: "))
        tries += 1
        if guess < secret:
            print("Too low!")
        elif guess > secret:
            print("Too high!")
        else:
            print("Correct! You got it in", tries, "tries")
            break


PROGRAMS = {
    1: ("Hello World", practice_01),
    2: ("Variables", practice_02),
    3: ("Input & Output", practice_03),
    4: ("Add Two Numbers", practice_04),
    5: ("Simple Calculator", practice_05),
    6: ("Even or Odd", practice_06),
    7: ("Largest of Three", practice_07),
    8: ("Grade Calculator", practice_08),
    9: ("Multiplication Table", practice_09),
    10: ("Sum of N Numbers", practice_10),
    11: ("Factorial", practice_11),
    12: ("Prime Number", practice_12),
    13: ("Fibonacci Series", practice_13),
    14: ("Reverse a Number", practice_14),
    15: ("Palindrome String", practice_15),
    16: ("Count Vowels", practice_16),
    17: ("List Operations", practice_17),
    18: ("Functions", practice_18),
    19: ("Dictionary - Student Marks", practice_19),
    20: ("Number Guessing Game", practice_20),
}

if __name__ == "__main__":
    for num, (title, _) in PROGRAMS.items():
        print(num, "-", title)
    choice = int(input("Kaunsa program chalana hai (1-20): "))
    PROGRAMS[choice][1]()


# PYTHON PRACTICE QUESTIONS (Unsolved)
# Author: Arjun Kumar
# Instructions: Har question ko apni alag file mein solve karo (jaise q01.py). Pehle khud try karo!
#
# --- LEVEL 1: BASICS ---
# Q1.  Take a number and print its square and cube.
# Q2.  Convert temperature from Celsius to Fahrenheit.  (F = C * 9/5 + 32)
# Q3.  Take length and breadth, print area and perimeter of a rectangle.
# Q4.  Swap two numbers without using a third variable.
# Q5.  Calculate simple interest.  (SI = P * R * T / 100)
#
# --- LEVEL 2: CONDITIONS ---
# Q6.  Check whether a year is a leap year or not.
# Q7.  Check whether a character is a vowel or consonant.
# Q8.  Check whether a number is positive, negative or zero.
# Q9.  Take age as input and tell if the person can vote (18+).
# Q10. Calculate electricity bill: first 100 units Rs 5/unit, next 100 Rs 7/unit, above 200 Rs 10/unit.
#
# --- LEVEL 3: LOOPS ---
# Q11. Print all even numbers from 1 to 100.
# Q12. Find the sum of digits of a number.  (1234 -> 10)
# Q13. Check whether a number is an Armstrong number.  (153 = 1^3 + 5^3 + 3^3)
# Q14. Print this pattern for n = 5:
#         *
#         * *
#         * * *
#         * * * *
#         * * * * *
# Q15. Find the GCD (HCF) of two numbers.
#
# --- LEVEL 4: STRINGS & LISTS ---
# Q16. Count the number of words in a sentence.
# Q17. Remove duplicate elements from a list.
# Q18. Find the second largest number in a list.
# Q19. Check whether two strings are anagrams.  (listen, silent)
# Q20. Count how many times each character appears in a string.
#
# --- LEVEL 5: FUNCTIONS & MINI PROJECTS ---
# Q21. Write a function is_prime(n) and print all primes between 1 and 100.
# Q22. Write a function to reverse a string without using [::-1].
# Q23. Make a simple ATM program: check balance, deposit, withdraw, exit (menu with while loop).
# Q24. Make a student report card: take 5 subject marks, print total, percentage and grade.
# Q25. Make a Rock-Paper-Scissors game against the computer (use random).
