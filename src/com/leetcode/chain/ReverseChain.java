package com.leetcode.chain;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseChain {

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static ListNode recurseReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = recurseReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode node2 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode listNode1 = reverseList(listNode);
        ListNode listNode2 = recurseReverseList(node2);
        System.out.println(listNode1);
        System.out.println(listNode2);
    }

}

