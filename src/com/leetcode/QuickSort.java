package com.leetcode;

import java.util.Arrays;

/**
 * 快排.
 * [6,3,7,4,1]
 *
 * @author simmon
 * @since 2021/4/12
 */
public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int i = left, j = right, pivot = nums[left];
            while (i < j && nums[i] >= pivot) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
                right--;
            }

            while (i > j && nums[i] < pivot) {
                i--;
            }

            if (i < j) {
                nums[j--] = nums[i];
                left --;
            }
            nums[i] = pivot;
            quickSort(nums, left, i - 1);
            quickSort(nums, right, j - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, 7, 4, 1};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

}
