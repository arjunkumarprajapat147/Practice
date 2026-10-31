"""
Practice 20: Number Guessing Game
Task: Guess the secret number with hints.
Author: Arjun Kumar
"""

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
