"""
Practice 15: Palindrome String
Task: Check if a word reads the same backwards.
Author: Arjun Kumar
"""

word = input("Enter a word: ").lower()
if word == word[::-1]:
    print(word, "is a Palindrome")
else:
    print(word, "is not a Palindrome")
