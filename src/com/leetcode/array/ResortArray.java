package com.leetcode.array;

/**
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 *
 * i=0 old:0,new:0
 * i=1 old:1 new:3
 * i=2 old:2 new:1
 * i=3 old:3 new:4
 * i=4 old:4 new:2
 * i=5 old:5 new:5
 * @author simmon
 * @since 2021/4/26
 */
public class ResortArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            newArray[j++] = nums[i];
            newArray[j++] = nums[n+i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 9, 4};//132954
        int[] shuffle = shuffle(nums, 3);
        for (int i1 : shuffle) {
            System.out.println(i1);
        }
    }

}
