package dev.ggorantala.ds.arrays.problems;

import java.util.Arrays;

/**
 * This class provides methods to find the largest value in an array. It includes an optimal
 * solution that iterates through the array and a sorting-based solution (not recommended).
 *
 * @author ggorantala
 */
public class FindLargestValue {

  public static void main(String[] args) {
    int[] A = {10, -10, 4, 7, 8, 42};

    System.out.println(findLargestValue(A));
    System.out.println(sorting(A));
  }

  // Optimal solution
  // This function finds the largest value in an array.
  // It iterates through the array, comparing each element to the current maximum.
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  private static int findLargestValue(int[] A) {
    if (A.length == 0) {
      return -1;
    }
    if (A.length == 1) {
      return A[A.length - 1];
    }

    int max = A[0];

    for (int i = 1; i < A.length; i += 1) {
      if (A[i] > max) {
        max = A[i];
      }
    }

    return max;
  }

  // Sorting solution ❌Not Recommended
  // This function sorts the array and returns the last element, which is the largest.
  private static int sorting(int[] A) {
    Arrays.sort(A);
    return A[A.length - 1];
  }
}
