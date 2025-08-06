package dev.ggorantala.ds.arrays.theory.shiftingalgorithms.deletions;

import java.util.Arrays;

/**
 * This class contains array declaration and initialization. This class also contains an expression
 * that deletes an item at the end of the array.
 *
 * @author ggorantala
 */
public class DeleteAtEnd {
  public static void main(String[] args) {
    // Declare an integer array of 10 elements.
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Say we want to delete the element at index 1
    int currentLength = A.length;

    System.out.println(Arrays.toString(A)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    System.out.println("current array items length: " + currentLength); // 10
    System.out.println("Array capacity: " + A.length); // 10
    // The array currently contains 0 elements

    currentLength -= 1;
    A[A.length - 1] = 0;
    System.out.println("current array items length: " + currentLength); // 9
    System.out.println(Arrays.toString(A));
  }
}
