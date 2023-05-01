package com.java.leetcode.solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Arrays should have at least two values.");
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; ++i) {
            if(map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
