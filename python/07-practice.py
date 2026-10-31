"""
Practice 07: Largest of Three
Task: Find the largest of three numbers.
Author: Arjun Kumar
"""

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
