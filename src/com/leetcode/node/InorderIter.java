package com.leetcode.node;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 *
 * @author simmon
 * @since 2022/4/24
 */
public class InorderIter {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        inorder(root, integers);
//        if (root == null) {
//            return integers;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = root;
//        while (current != null || !stack.isEmpty()) {
//            while (current != null) {
//                stack.push(current);
//                current = current.left;
//            }
//            TreeNode node = stack.pop();
//            integers.add(node.val);
//            current = node.right;
//        }
        return integers;

    }

    public static void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);

    }


}


