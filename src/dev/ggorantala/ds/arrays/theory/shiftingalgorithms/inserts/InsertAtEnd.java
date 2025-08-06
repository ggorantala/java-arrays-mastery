package dev.ggorantala.ds.arrays.theory.shiftingalgorithms.inserts;

import java.util.Arrays;

/**
 * This class contains array declaration and initialization. This class also contains a method that
 * inserts an item at the end of the array.
 *
 * @author ggorantala
 */
public class InsertAtEnd {
  public static void main(String[] args) {
    int[] A = new int[5];
    int currentLength = 0;

    // Let us add 2 elements to the array
    for (int i = 0; i < 2; i++) {
      A[i] = i + 100;
      currentLength++; // when i=1, length is set to 2
    }

    System.out.println(Arrays.toString(A)); // [100, 101, 0, 0, 0]
    System.out.println("current array items length " + currentLength); // 2
    System.out.println("Array capacity " + A.length); // 5
    System.out.println(
        "Element insert at end "
            + Arrays.toString(insertAtEnd(A, currentLength))); // [100, 101, 200, 0, 0]
  }

  // Inserting element at the end
  public static int[] insertAtEnd(int[] A, int currentLength) {
    A[currentLength] = 200;
    return A;
  }
}

/*
Outputs:
[100, 101, 0, 0, 0]
current array items length 2
Array capacity 5
Element insert at end [100, 101, 200, 0, 0]
*/
