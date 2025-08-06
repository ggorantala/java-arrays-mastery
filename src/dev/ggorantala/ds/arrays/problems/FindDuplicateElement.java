package dev.ggorantala.ds.arrays.problems;

import java.util.HashSet;

/**
 * This class provides a method to find a duplicate element in an array. It uses a HashSet to track
 * unique elements and returns the first duplicate found.
 *
 * @author ggorantala
 */
public class FindDuplicateElement {
  public static void main(String[] args) {
    int[] A = {-7, 5, 1, 4, 2, 2};

    System.out.println(findDuplicate(A));
  }

  private static int findDuplicate(int[] A) {
    HashSet<Integer> uniqueElements = new HashSet<>();

    for (int el : A) {
      if (uniqueElements.contains(el)) {
        return el;
      }

      uniqueElements.add(el);
    }
    return -1;
  }
}
