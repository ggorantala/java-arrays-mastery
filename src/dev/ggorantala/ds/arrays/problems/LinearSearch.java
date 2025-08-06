package dev.ggorantala.ds.arrays.problems;

/**
 * This class implements a linear search algorithm to find the index of a target element in an
 * array. It iterates through each element of the array and returns the index of the first
 * occurrence of the target element. If the target is not found, it returns -1.
 *
 * @author ggorantala
 */
public class LinearSearch {

  /**
   * Performs a linear search on the given array to find the index of the target element.
   *
   * @param nums the array to search
   * @param target the element to find
   * @return the index of the target element if found, otherwise -1
   */
  public static int linearSearch(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i; // return the index if the element is found
      }
    }
    return -1; // return -1 if the element is not found
  }

  public static void main(String[] args) {
    int[] nums = {5, 2, 9, 1, 7, 4};
    int target = 7;

    int index = linearSearch(nums, target);
    if (index != -1) {
      System.out.println("Element " + target + " found at index " + index);
    } else {
      System.out.println("Element not found");
    }
  }
}

/* Outputs: Element 7 found at index 4 */
