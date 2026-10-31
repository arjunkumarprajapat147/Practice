"""
Practice 10: Sum of N Numbers
Task: Find the sum of 1 to N using a while loop.
Author: Arjun Kumar
"""

n = int(input("Enter N: "))
total = 0
i = 1
while i <= n:
    total += i
    i += 1
print("Sum of 1 to", n, "=", total)
