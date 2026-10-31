"""
Practice 13: Fibonacci Series
Task: Print the first N Fibonacci numbers.
Author: Arjun Kumar
"""

n = int(input("How many terms? "))
a, b = 0, 1
for _ in range(n):
    print(a, end=" ")
    a, b = b, a + b
print()
