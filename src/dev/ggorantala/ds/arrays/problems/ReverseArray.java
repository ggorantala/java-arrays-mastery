package dev.ggorantala.ds.arrays.problems;

import java.util.Arrays;

/**
 * This class provides a method to reverse an array in place. It uses two pointers to swap elements
 * from the start and end of the array until they meet in the middle.
 *
 * @author ggorantala
 */
public class ReverseArray {
  public static void reverseArray(int[] array) {
    int startIndex = 0;
    int endIndex = array.length - 1;

    while (startIndex < endIndex) {
      // Swap elements at startIndex and endIndex indices
      int temp = array[startIndex];
      array[startIndex] = array[endIndex];
      array[endIndex] = temp;

      // Move towards the center
      startIndex++;
      endIndex--;
    }
  }

  public static void main(String[] args) {
    final int[] INPUT = {1, 2, 3, 4, 5};
    System.out.println("Original Array: " + Arrays.toString(INPUT));

    reverseArray(INPUT);
    System.out.println("Reversed Array: " + Arrays.toString(INPUT));
  }
}
