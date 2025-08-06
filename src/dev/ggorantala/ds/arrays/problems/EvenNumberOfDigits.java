package dev.ggorantala.ds.arrays.problems;

/**
 * This class provides methods to count the number of integers in an array that have an even number
 * of digits. It includes various approaches such as division, logarithmic, recursive, and string
 * conversion.
 *
 * @author ggorantala
 */
public class EvenNumberOfDigits {
  public static void main(String[] args) {
    int[] A = {100, 25, 51, 2000, 4999};
    System.out.println(evenDigits(A));
    System.out.println(evenDigitsLogarithmic(A));
    System.out.println(recursiveApproach(A));
  }

  // division approach
  private static int evenDigits(int[] A) {
    int result = 0;
    for (int i = 0; i < A.length; i++) {
      int number = A[i];
      int count = 0;

      while (number > 0) {
        ++count;
        number /= 10;
      }

      result += (count & 1) == 0 ? 1 : 0;
    }
    return result;
  }

  // logarithmic approach
  private static int evenDigitsLogarithmic(int[] A) {
    int result = 0;
    for (int number : A) {
      int count = number != 0 ? ((int) Math.floor(Math.log10(number) + 1)) : -1;
      result += (count & 1) == 0 ? 1 : 0;
    }
    return result;
  }

  // recursive approach

  private static int recursiveApproach(int[] A) {
    int result = 0;

    for (int number : A) {
      result += (helper(number) & 1) == 0 ? 1 : 0;
    }
    return result;
  }

  private static int helper(int n) {
    // base checks
    if (n == 0) {
      return 0;
    }

    return (1 + helper(n / 10));
  }

  // string conversion approach
  private static int convertToString(int[] A) {
    int result = 0;

    for (int number : A) {
      String n = Integer.toString(number);

      result += ((n.length()) & 1) == 0 ? 1 : 0;
    }
    return result;
  }
}
