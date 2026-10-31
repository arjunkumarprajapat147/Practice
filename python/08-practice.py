"""
Practice 08: Grade Calculator
Task: Print grade from marks (A/B/C/D/F).
Author: Arjun Kumar
"""

marks = int(input("Enter marks (0-100): "))
if marks >= 80:
    grade = "A"
elif marks >= 60:
    grade = "B"
elif marks >= 50:
    grade = "C"
elif marks >= 40:
    grade = "D"
else:
    grade = "F"
print("Grade:", grade)
