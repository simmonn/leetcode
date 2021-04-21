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
        //前指针节点
        ListNode pre = null;
        //当前指针节点
        ListNode curr = head;
        while (curr != null) {
            //下一节点暂存,为了节点后移
            ListNode tmp = curr.next;
            //将下一节点只想前一节点
            curr.next = pre;
            //前节点指针后移
            pre = curr;
            //当前指针后移
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
