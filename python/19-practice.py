"""
Practice 19: Dictionary - Student Marks
Task: Store student marks in a dictionary and find the topper.
Author: Arjun Kumar
"""

marks = {"Arjun": 85, "Ravi": 72, "Priya": 91, "Amit": 64}
for name, m in marks.items():
    print(name, ":", m)
topper = max(marks, key=marks.get)
print("Topper:", topper, "with", marks[topper])
