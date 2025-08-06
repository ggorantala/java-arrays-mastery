package dev.ggorantala.ds.arrays.theory.threedimensional;

import java.util.Arrays;

public class Print3DArray {
  public static void main(String[] args) {
    int[][][] cube = {
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

    printUsingTraditionalLoop(cube);
  }

  // Method 1: Traditional for-loop
  private static void printUsingTraditionalLoop(int[][][] cube) {
    int depth = cube.length; // Number of layers
    int rows = cube[0].length; // Number of rows per layer
    int columns = cube[0][0].length; // Number of columns per row

    for (int layer = 0; layer < depth; layer++) {
      System.out.println("Layer " + layer + ":");
      for (int row = 0; row < rows; row++) {
        for (int col = 0; col < columns; col++) {
          System.out.print(cube[layer][row][col] + " ");
        }
        System.out.println(); // New line after each row
      }
      System.out.println(); // New line after each layer
    }

    // Alternative: Using enhanced for-loop
    for (int layer = 0; layer < cube.length; layer++) {
      System.out.println("Layer " + layer + ":");
      for (int row = 0; row < cube[layer].length; row++) {
        for (int col = 0; col < cube[layer][row].length; col++) {
          System.out.print(cube[layer][row][col] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  // Method 2: Enhanced for-loop
  // Method 2: Enhanced for-loop (for-each)
  private static void printUsingEnhancedLoop(int[][][] cube) {
    int layerIndex = 0;
    for (int[][] layer : cube) {
      System.out.println("Layer " + layerIndex + ":");
      for (int[] row : layer) {
        for (int element : row) {
          System.out.print(element + " ");
        }
        System.out.println();
      }
      System.out.println();
      layerIndex++;
    }
  }

  // Method 3: Functional style using Streams

  private static void printUsingStreams(int[][][] cube) {
    for (int i = 0; i < cube.length; i++) {
      final int layerIndex = i;
      System.out.println("Layer " + layerIndex + ":");

      Arrays.stream(cube[i])
          .forEach(
              row -> {
                Arrays.stream(row).forEach(element -> System.out.print(element + " "));
                System.out.println();
              });
      System.out.println();
    }
  }
}
