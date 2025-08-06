package dev.ggorantala.ds.arrays.problems;

/**
 * This class provides a method to reverse the first K characters of a given string. If K is greater
 * than the length of the string, it reverses the entire string. The method handles edge cases such
 * as null or single-character strings.
 *
 * @author ggorantala
 */
public class ReverseKCharacters {
  public static void main(String[] args) {
    String first = "apple";
    String second = "Oranges";

    System.out.println(reverseString(first.toCharArray(), 7));
    System.out.println(reverseString(second.toCharArray(), 3));
  }

  public static String reverseString(char[] charArray, int K) {
    if (charArray == null) return "";
    if (charArray.length == 1) return new String(charArray);

    K = K % charArray.length;
    int start = 0;
    int end = K - 1;

    while (start < end) {
      char ch = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = ch;

      start++;
      end--;
    }
    return new String(charArray);
  }
}
