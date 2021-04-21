package com.leetcode.link;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * 单链翻转.
 *
 * @author simmon
 * @since 2021/4/21
 */
public class ReverseLink {

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode rev = reverseList(listNode);
        System.out.println(rev);
    }

}
