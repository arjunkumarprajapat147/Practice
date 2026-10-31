"""
Practice 05: Simple Calculator
Task: Do +, -, *, / on two numbers.
Author: Arjun Kumar
"""

a = float(input("a: "))
b = float(input("b: "))
print("a + b =", a + b)
print("a - b =", a - b)
print("a * b =", a * b)
if b != 0:
    print("a / b =", a / b)
else:
    print("Cannot divide by zero")
