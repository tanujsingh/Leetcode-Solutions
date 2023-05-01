package com.java.leetcode.solutions.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private final TwoSum testObj = new TwoSum();
    @Test
    public void testTwoSum() {
        int[] nums = new int[]{1, 4, 2, 9, 5, 3};
        int target = 7;
        int[] expected = new int[]{4, 2};
        assertArrayEquals(expected, testObj.twoSum(nums, target));
    }
}