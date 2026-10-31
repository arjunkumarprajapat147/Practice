"""
Practice 17: List Operations
Task: Find sum, max, min and average of a list.
Author: Arjun Kumar
"""

nums = [12, 45, 7, 23, 56, 89, 34]
print("List:", nums)
print("Sum:", sum(nums))
print("Max:", max(nums))
print("Min:", min(nums))
print("Average:", round(sum(nums) / len(nums), 2))
nums.sort()
print("Sorted:", nums)
