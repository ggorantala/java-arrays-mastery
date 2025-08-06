package dev.ggorantala.ds.arrays.theory.arraysoverview;

import java.util.Arrays;

/**
 * This class contains array declaration and initialization. This class also contains a method that
 * loads some values and prints both length, capacity of the array.
 *
 * @author ggorantala
 */
public class CapacityAndLength {
  public static void main(String[] args) {
    int[] A = new int[10];
    System.out.println("Array Capacity " + A.length); // 10

    findLength(A);
  }

  // length and capacity
  static void findLength(int[] A) {

    int currentItemsLength = 0;
    for (int i = 0; i < 4; i++) {
      currentItemsLength += 1;
      A[i] = i + 10;
    }

    System.out.println(Arrays.toString(A)); // [10, 11, 12, 13, 0, 0, 0, 0, 0, 0]
    System.out.println("Array length is " + currentItemsLength); // 4
    System.out.println("Array Capacity is " + A.length); // 10
  }
}
