"""
Practice 12: Prime Number
Task: Check whether a number is prime.
Author: Arjun Kumar
"""

n = int(input("Enter a number: "))
is_prime = n > 1
for i in range(2, int(n ** 0.5) + 1):
    if n % i == 0:
        is_prime = False
        break
print(n, "is Prime" if is_prime else "is Not Prime")
