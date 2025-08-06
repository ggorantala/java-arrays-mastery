package dev.ggorantala.ds.arrays.problems;

/**
 * This class provides methods to check if an array is monotonic. An array is monotonic if it is
 * either entirely non-increasing or non-decreasing. It includes both a two-pass and a one-pass
 * approach to determine monotonicity.
 *
 * @author ggorantala
 */
public class MonotonicArray {
  public static void main(String[] args) {
    int[] input = {1, 2, 2, 3};
    // two-pass approach
    System.out.println(isMonotonicTwoPass(input)); // true

    // one-pass approach
    System.out.println(isMonotonicOnePass(input)); // true
  }

  public static boolean isMonotonicTwoPass(int[] array) {
    return isIncreasing(array) || isDecreasing(array);
  }

  public static boolean isIncreasing(int[] nums) {
    for (int i = 1; i < nums.length; i++)
      if (nums[i - 1] > nums[i]) {
        return false;
      }
    return true;
  }

  public static boolean isDecreasing(int[] nums) {
    for (int i = 1; i < nums.length; i++)
      if (nums[i - 1] < nums[i]) {
        return false;
      }
    return true;
  }

  public static boolean isMonotonicOnePass(int[] array) {
    boolean isIncreasing = true;
    boolean isDecreasing = true;

    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1]) {
        isDecreasing = false;
      }

      if (array[i] > array[i - 1]) {
        isIncreasing = false;
      }
    }

    return isIncreasing || isDecreasing;
  }
}
