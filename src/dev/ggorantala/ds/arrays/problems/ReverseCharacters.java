package dev.ggorantala.ds.arrays.problems;

/**
 * This class provides a method to reverse the characters in a string represented as a character
 * array. It handles special characters and maintains the integrity of the input string.
 *
 * @author ggorantala
 */
public class ReverseCharacters {
  public static void main(String[] args) {
    String first = "apple";
    String second = "Oranges";
    String specialInput = "$%#Hello Special String##";

    System.out.println(reverseString(first.toCharArray()));
    System.out.println(reverseString(second.toCharArray()));
    System.out.println(reverseString(specialInput.toCharArray()));
  }

  public static String reverseString(char[] charArray) {
    // base case
    if (charArray == null) return "";
    if (charArray.length == 1) return new String(charArray);

    int start = 0;
    int end = charArray.length - 1;

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
