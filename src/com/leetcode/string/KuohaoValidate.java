package com.leetcode.string;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author simmon
 * @since 2022/4/23
 */
public class KuohaoValidate {

    Map<Character, Character> map = new HashMap<>() {
        {
            put(')', '(');
            put('}', '{');
            put(']', '[');

        }
    };

    public boolean isValid(String s) {
        if (s==null||s.length()==0) return false;
        int count = s.length();
        int index = 0;
        Deque<Character> stack = new LinkedList<>();
        while (index < count) {
            char c = s.charAt(index);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
            index++;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("{");
    }
}
