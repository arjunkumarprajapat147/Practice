"""
Practice 18: Functions
Task: Write functions for area of circle and rectangle.
Author: Arjun Kumar
"""

import math

def circle_area(r):
    return math.pi * r * r

def rectangle_area(l, w):
    return l * w

print("Circle (r=5):", round(circle_area(5), 2))
print("Rectangle (4x6):", rectangle_area(4, 6))
