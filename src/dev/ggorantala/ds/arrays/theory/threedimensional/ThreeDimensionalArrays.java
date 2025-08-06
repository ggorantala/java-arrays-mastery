package dev.ggorantala.ds.arrays.theory.threedimensional;

/**
 * This class demonstrates the creation and manipulation of a three-dimensional array in Java. It
 * initializes the array with some values and prints its elements. * A three-dimensional array can
 * be visualized as an array of arrays of arrays, where each element is accessed using three
 * indices.
 *
 * <p>This class serves as an example of how to work with three-dimensional arrays in Java,
 * including declaration, initialization, and iteration through the elements.
 *
 * @author ggorantala
 * @version 1.0
 */
public class ThreeDimensionalArrays {

  /*
    A three-dimensional array can be visualized as a cube or a stack of 2D arrays.
    Each element in a 3D array is accessed using three indices: [layer][row][column].
    For example, in a 3D array with dimensions [2][3][4], the indices represent:
    - Layer: 0 or 1 (2 layers)
    - Row: 0, 1, or 2 (3 rows)
    - Column: 0, 1, 2, or 3 (4 columns
     Layer 0          Layer 1          Layer 2
     [0][0][0]       [1][0][0]       [2][0][0]
    ┌─────────┐     ┌─────────┐     ┌─────────┐
    │ 1  2  3 │     │ 10 11 12│     │ 19 20 21│
    │ 4  5  6 │     │ 13 14 15│     │ 22 23 24│
    │ 7  8  9 │     │ 16 17 18│     │ 25 26 27│
    └─────────┘     └─────────┘     └─────────┘

    The following code initializes a 3D array with dimensions [3][3][3] and fills it with values:

    int[][][] cube = new int[3][3][3];

    // Filling the cube with values
     cube[0][0][0] = 1   cube[0][0][1] = 2   cube[0][0][2] = 3
     cube[0][1][0] = 4   cube[0][1][1] = 5   cube[0][1][2] = 6
     cube[0][2][0] = 7   cube[0][2][1] = 8   cube[0][2][2] = 9

     cube[1][0][0] = 10  cube[1][0][1] = 11  cube[1][0][2] = 12
     cube[1][1][0] = 13  cube[1][1][1] = 14  cube[1][1][2] = 15
     cube[1][2][0] = 16  cube[1][2][1] = 17  cube[1][2][2] = 18

     cube[2][0][0] = 19  cube[2][0][1] = 20  cube[2][0][2] = 21
     cube[2][1][0] = 22  cube[2][1][1] = 23  cube[2][1][2] = 24
     cube[2][2][0] = 25  cube[2][2][1] = 26  cube[2][2][2] = 27
  */
  public static void main(String[] args) {
    // step by step initialization of a 3D array
    int[][][] cube = new int[2][3][3];

    // Initialize layer 0
    cube[0][0][0] = 1;    cube[0][0][1] = 2;    cube[0][0][2] = 3;
    cube[0][1][0] = 4;    cube[0][1][1] = 5;    cube[0][1][2] = 6;
    cube[0][2][0] = 7;    cube[0][2][1] = 8;    cube[0][2][2] = 9;

    // Initialize layer 1
    cube[1][0][0] = 10;    cube[1][0][1] = 11;    cube[1][0][2] = 12;
    cube[1][1][0] = 13;    cube[1][1][1] = 14;    cube[1][1][2] = 15;
    cube[1][2][0] = 16;    cube[1][2][1] = 17;    cube[1][2][2] = 18;

    // in-line initialization of a 3D array
    // More compact initialization
    int[][][] cube01 = {
      {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
      },
      {
        {10, 11, 12},
        {13, 14, 15},
        {16, 17, 18}
      }
    };

    // dynamic initialization of a 3D array
    int[][][] cube03 = new int[3][4][5];
    int value = 1;

    for (int layer = 0; layer < 3; layer++) {
      for (int row = 0; row < 4; row++) {
        for (int col = 0; col < 5; col++) {
          cube03[layer][row][col] = value++;
        }
      }
    }
  }
}
