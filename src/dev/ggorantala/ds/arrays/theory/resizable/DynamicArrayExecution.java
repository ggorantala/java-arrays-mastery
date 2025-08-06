package dev.ggorantala.ds.arrays.theory.resizable;

/**
 * This class contains an assignment for demonstrating and creating dynamic array we constructed in
 * the same package(such as declaration and initialization).
 *
 * <p>This class acts as execution, and it tries to execute and test all the methods present in the
 * `ArrayImplementation` class
 *
 * @author ggorantala
 */
public class DynamicArrayExecution {
  private static final int[] INPUT = new int[] {1, 2, 3, 4, 5, 6, 7, 11, 9};

  public static void main(String[] args) {
    DynamicArray array = new DynamicArray(4);
    for (int value : INPUT) {
      array.insert(value);
    }

    array.remove(2); // removed element `3` from array

    System.out.println(array.get(0)); // 1
    System.out.println(array.size()); // 8

    // The extra o's are because of the array capacity which is 16
    array.print(); // 1, 2, 4, 5, 6, 7, 11, 9, 0, 0, 0, 0, 0, 0, 0, 0
  }
}
