package dev.ggorantala.ds.arrays.theory.shiftingalgorithms.inserts;

import java.util.Arrays;

/**
 * This class contains various assignments for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains a method that shifts elements first to
 * make space for the new element and inserts element at the start/middle of the array index after
 * the loop is completed
 *
 * @author ggorantala
 */
public class InsertInStartOrMiddle {

  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int insertValue = 100;
    int insertAtIndex = 5;
    int i;

    System.out.println(Arrays.toString(values)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    for (i = values.length - 2; i >= insertAtIndex; i--) {
      values[i + 1] = values[i];
    }

    values[insertAtIndex] = insertValue;

    System.out.println(Arrays.toString(values)); // [1, 2, 3, 4, 5, 100, 6, 7, 8, 9]
  }
}
