package com.leetcode.array;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 *
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xa1401/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @author simmon
 * @since 2022/4/20
 */
public class LargestNum {

    public static String largestNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>((x,y)->(y+x).compareTo(x+y));
        for (int num : nums) {
            queue.offer(String.valueOf(num));
        }
        String res = "";
        while (queue.size() > 0) {
            res += queue.poll();
        }
        if (res.charAt(0)=='0') return "0";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{1, 2, 21, 12}));
    }

}
