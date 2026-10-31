"""
Practice 09: Multiplication Table
Task: Print the table of a number using a for loop.
Author: Arjun Kumar
"""

n = int(input("Enter a number: "))
for i in range(1, 11):
    print(n, "x", i, "=", n * i)
