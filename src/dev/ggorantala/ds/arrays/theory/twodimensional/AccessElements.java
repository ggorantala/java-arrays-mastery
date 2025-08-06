package dev.ggorantala.ds.arrays.theory.twodimensional;

import java.util.Arrays;

/**
 * This class contains various assignments for demonstrating and creating 2Darrays (such as
 * declaration and initialization). This class also contains few methods that help access elements
 * of a 2D array using indexes [row][col]
 *
 * @author ggorantala
 */
public class AccessElements {
  public static void main(String[] args) {
    int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    usingForLoop(grid);
    usingDeepToString(grid);
    forEachLoop(grid);
  }

  private static void usingForLoop(int[][] grid) {

    int N = grid.length; // rows
    int M = grid[0].length; // columns

    for (int row = 0; row < N; row += 1) {
      for (int col = 0; col < M; col += 1) {
        System.out.println(grid[row][col]);
      }
    }

    /*
    for (int row=0; row < grid.length; row++)
    {
        for (int col=0; col < grid[row].length; col++)
        {
            int value = grid[row][col];
            // Do stuff
        }
    }
     */
  }

  // using deepToString static method from Array utils class
  public static void usingDeepToString(int[][] grid) {
    System.out.println(Arrays.deepToString(grid));
  }

  // using one-dimensional loop
  public static void forEachLoop(int[][] grid) {
    // Note the different use of "row" as a variable name! This
    // is the *whole* row, not the row *number*.
    for (int[] row : grid) {
      for (int value : row) {
        System.out.println(value);
      }
    }
  }
}
