package dev.ggorantala.ds.arrays.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * This class contains various assignments for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains print statements and two for-loops that
 * explain how to iterate through arrays
 *
 * @author ggorantala
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 18;

    System.out.println(Arrays.toString(bruteforce1(nums, target)));
    System.out.println(Arrays.toString(bruteforce2(nums, target)));

    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  // naive approach [math formula 🤔]
  static int[] bruteforce1(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] + nums[i] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }

  // refactoring above snippet with simple math, `y = target - x`
  static int[] bruteforce2(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] + nums[i] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }

  // memoization technique
  static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> ans = new HashMap<>();

    for (int i = 0; i < nums.length; i += 1) {
      int difference = target - nums[i];

      if (ans.containsKey(difference)) {
        return new int[] {ans.get(difference), i};
      }
      ans.put(nums[i], i);
    }

    return new int[] {-1, -1};
  }
}
