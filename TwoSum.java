package Algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Ex1. Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 16};
        int target = 27;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [2,3]
    }
}
