"""
Practice 16: Count Vowels
Task: Count vowels in a sentence.
Author: Arjun Kumar
"""

text = input("Enter a sentence: ").lower()
count = 0
for ch in text:
    if ch in "aeiou":
        count += 1
print("Vowels:", count)
