package dev.ggorantala.ds.arrays.theory.threedimensional;

public class ThreeDArrayErrorHandling {
  public static void safePrint(int[][][] array) {
    try {
      for (int[][] ints : array) {
        for (int[] anInt : ints) {
          for (int i : anInt) {
            System.out.print(i + " ");
          }
          System.out.println();
        }
        System.out.println("---");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Array index out of bounds: " + e.getMessage());
    } catch (NullPointerException e) {
      System.err.println("Null array encountered: " + e.getMessage());
    }
  }
}
