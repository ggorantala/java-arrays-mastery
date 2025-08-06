package dev.ggorantala.ds.arrays.theory.threedimensional;

public class Print3DArrayCompleteExample {
  public static void main(String[] args) {
    // Create sample 3D array
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

    System.out.println("=== Traditional For-Loop Method ===");
    printUsingTraditionalLoop(cube);

    System.out.println("=== Enhanced For-Loop Method ===");
    printUsingEnhancedLoop(cube);

    System.out.println("=== Array Dimensions ===");
    printDimensions(cube);

    System.out.println("=== Element Count ===");
    System.out.println("Total elements: " + countElements(cube));
  }

  private static void printUsingTraditionalLoop(int[][][] cube) {
    int depth = cube.length;
    int rows = cube[0].length;
    int columns = cube[0][0].length;

    for (int layer = 0; layer < depth; layer++) {
      System.out.println("Layer " + layer + ":");
      for (int row = 0; row < rows; row++) {
        for (int col = 0; col < columns; col++) {
          System.out.print(cube[layer][row][col] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

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

  private static void printDimensions(int[][][] cube) {
    System.out.println("Depth (Layers): " + cube.length);
    System.out.println("Rows per layer: " + cube[0].length);
    System.out.println("Columns per row: " + cube[0][0].length);
  }

  private static int countElements(int[][][] cube) {
    return cube.length * cube[0].length * cube[0][0].length;
  }
}
