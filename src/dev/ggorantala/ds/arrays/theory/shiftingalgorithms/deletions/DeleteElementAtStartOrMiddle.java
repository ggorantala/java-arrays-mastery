package dev.ggorantala.ds.arrays.theory.shiftingalgorithms.deletions;

import java.util.Arrays;

/**
 * This class contains an array assignment for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains a for-loop that replaces the (i-1)th
 * index elements value with ith value starting from index 2. This explains the deletion algorithms
 *
 * @author ggorantala
 */
public class DeleteElementAtStartOrMiddle {
  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Say we want to delete the element at index 1
    int currentLength = A.length;

    System.out.println(Arrays.toString(A)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    System.out.println("current array items length: " + currentLength); // 10
    System.out.println("Array capacity: " + A.length); // 10
    for (int i = 2; i < A.length; i++) {
      // Shift each element one position to the left
      A[i - 1] = A[i];
    }

    // Again, the length needs to be consistent with the current
    // state of the array.
    currentLength -= 1;
    A[A.length - 1] = 0; // reset the last element to zero
    System.out.println("New array items length: " + currentLength); // 9

    System.out.println("After element is removed: " + Arrays.toString(A));
  }
}
