package com.leetcode.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author simmon
 * @since 2022/4/23
 */
public class LongestCommonString {

    public String longestCommonString(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 两个两个的查找
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            //对比两个字符串,找出公共
            prefix = commonString(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String commonString(String prefix, String str2) {
        int minLength = Math.min(prefix.length(), str2.length());
        int index = 0;
        while (index < minLength && prefix.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return prefix.substring(0, index);
    }

}
