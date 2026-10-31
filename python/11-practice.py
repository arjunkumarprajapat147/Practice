"""
Practice 11: Factorial
Task: Find the factorial of a number.
Author: Arjun Kumar
"""

n = int(input("Enter a number: "))
fact = 1
for i in range(1, n + 1):
    fact *= i
print("Factorial of", n, "=", fact)
