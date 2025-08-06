package dev.ggorantala.ds.arrays.problems;

/**
 * This class provides a method to find the element that occurs an odd number of times in an array.
 * It uses the XOR operation to efficiently determine the odd occurring element.
 *
 * @author ggorantala
 */
public class FindOddOccurringElement {
  private static int helper(int[] arr) {
    int res = 0;
    for (int value : arr) {
      res ^= value;
    }
    return res;
  }

  public static void main(String[] args) {
    int result = helper(new int[] {4, 3, 3, 4, 4, 4, 5, 3, 5});
    System.out.println("Odd occurring element is " + result);
  }
}
