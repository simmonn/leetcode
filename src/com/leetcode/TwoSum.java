package com.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * [2,7,11,15]
 *
 * @author simmon
 * @since 2021/4/12
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            for (int j = 1; j < nums.length-1; j++) {
                if (target == one + nums[j]) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }

    }
}
