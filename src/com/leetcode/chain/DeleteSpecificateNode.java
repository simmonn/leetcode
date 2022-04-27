package com.leetcode.chain;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：给定你链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 * @author simmon
 * @since 2021/4/26
 */
public class DeleteSpecificateNode {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;


    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        deleteNode(listNode);
        System.out.println(listNode);
    }

}
