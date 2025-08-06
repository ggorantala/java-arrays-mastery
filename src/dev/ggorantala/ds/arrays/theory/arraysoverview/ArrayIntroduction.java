package dev.ggorantala.ds.arrays.theory.arraysoverview;

import java.util.Arrays;

/**
 * This class contains various assignments for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains print statements and two for-loops that
 * explain how to iterate through arrays
 *
 * @author ggorantala
 */
public class ArrayIntroduction {
  public static void main(String[] args) {
    int a = 100;

    // each of the following occupies 4 bytes, which is 6 * 4 bytes
    int a1 = 100;
    int a2 = 200;
    int a3 = 300;
    int a4 = 400;
    int a5 = 500;
    int a6 = 600;

    // array declaration and initialization
    int[] array = {100, 200, 300, 400, 500, 600};

    int[] arr = new int[3]; // stores 3 items, capacity = 3 and size is 0(no items added, so far)

    System.out.println(Arrays.toString(arr)); // [0, 0, 0]

    // approach 1
    int[] A = new int[5];

    A[0] = 1;
    A[1] = 2;
    A[2] = 3;
    A[3] = 4;
    A[4] = 5;

    // approach 2
    int[] B = {1, 2, 3, 4, 5};

    // String arrays
    String[] fruits = new String[3]; // contains 3 strings

    // char arrays
    char[] chars = new char[256]; // contains 256 items

    System.out.println(A[100]); // ArrayIndexOutOfBoundsException

    // print array elements
    int[] input = {1, 2, 3, 4, 5};

    int N = input.length;

    // one way to print elements
    for (int i = 0; i < N; i++) {
      System.out.println(input[i]);
    }

    // second way to print elements
    for (int j : input) {
      System.out.println(j);
    }
  }
}
