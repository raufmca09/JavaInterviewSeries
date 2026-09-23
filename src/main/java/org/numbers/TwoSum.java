package org.numbers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Two Sum - Find two numbers in an array that add to a given target using a hashmap
 * for efficient lookups and return the indices of thw teo number such that they add
 * up to a target
 * @Author: Abdulrouf
 */
public class TwoSum {

    public static void main(String args[]) {

        int nums[] = {2, 11, 5, 4};
        int target = 9;

        int result[] = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] findTwoSum(int nums[], int target) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int extra = target - nums[i];

            if (numMap.containsKey(extra)) {
                return new int[]{numMap.get(extra), i};
            }
            numMap.put(nums[i], i);
        }

        return null;
    }
}
