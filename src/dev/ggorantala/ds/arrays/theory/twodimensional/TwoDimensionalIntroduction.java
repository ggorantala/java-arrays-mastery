package dev.ggorantala.ds.arrays.theory.twodimensional;

import java.util.Arrays;

/**
 * This class contains various assignments for demonstrating and creating 2Darrays (such as
 * declaration and initialization). This class also contains how to access elements of a 2D array
 * using indexes [row][col]
 *
 * @author ggorantala
 */
public class TwoDimensionalIntroduction {
  public static void main(String[] args) {
    // dataType[][] arrayName = new dataType[rows][columns];

    // declaration and initialization
    // approach 1
    int[][] grid_one = new int[3][3];
    grid_one[0][0] = 1;
    grid_one[0][1] = 2;
    grid_one[0][2] = 3;
    grid_one[1][0] = 4;
    grid_one[1][1] = 5;
    grid_one[1][2] = 6;
    grid_one[2][0] = 7;
    grid_one[2][1] = 8;
    grid_one[2][2] = 9;

    // approach 2
    int[][] grid_two = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // access elements
    // grid_two[4][4] -> ArrayIndexOutOfBoundsException
    int element = grid_two[1][2];
    grid_two[1][2] = 100;

    System.out.println(Arrays.deepToString(grid_two)); // [[1, 2, 3], [4, 5, 100], [7, 8, 9]]
  }
}
