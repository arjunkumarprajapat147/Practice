/*
 * Practice 17: Array Operations
 * Task: Find sum, max, min and average of an array.
 * Author: Arjun Kumar
 * Run: javac Practice17.java && java Practice17
 */
import java.util.Arrays;

public class Practice17 {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 23, 56, 89, 34};
        int sum = 0, max = nums[0], min = nums[0];
        for (int x : nums) {
            sum += x;
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + (double) sum / nums.length);
        Arrays.sort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}
