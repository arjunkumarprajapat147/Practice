"""
Practice 14: Reverse a Number
Task: Reverse the digits of a number.
Author: Arjun Kumar
"""

n = int(input("Enter a number: "))
rev = 0
while n > 0:
    rev = rev * 10 + n % 10
    n //= 10
print("Reversed:", rev)
