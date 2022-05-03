package com.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
 *
 * 返回满足此条件的 任一数组 作为答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,1,2,4]
 * 输出：[2,4,3,1]
 * 解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author simmon
 * @since 2022/4/28
 */
public class SortParity {

    public int[] sortArrayByParity(int[] nums) {
        int[] ints = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ints[left++] = num;
            } else {
                ints[right--] = num;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        SortParity sortParity = new SortParity();
        int[] ints = sortParity.sortArrayByParity(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
}
