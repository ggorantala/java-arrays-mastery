package dev.ggorantala.ds.arrays.problems;

/**
 * This class implements a binary search algorithm to find the index of a target element in a sorted
 * array. The binary search algorithm works by repeatedly dividing the search interval in half. If
 * the value of the target is less than the item in the middle of the interval, narrow the interval
 * to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is
 * found or the interval is empty.
 *
 * @author ggorantala
 */
public class BinarySearch {
  public static int binarySearch(int[] nums, int target) {
    int startIndex = 0;
    int endIndex = nums.length - 1;

    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (nums[middleIndex] == target) {
        return middleIndex; // return the index if the element is found
      } else if (nums[middleIndex] < target) {
        startIndex = middleIndex + 1; // continue searching in the endIndex half
      } else {
        endIndex = middleIndex - 1; // continue searching in the startIndex half
      }
    }

    return -1; // return -1 if the element is not found
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int target = 4;

    int index = binarySearch(nums, target);
    if (index != -1) {
      System.out.println("Element " + target + " found at index " + index);
    } else {
      System.out.println("Element not found");
    }
  }
}

/* Outputs: Element 4 found at index 3 */
