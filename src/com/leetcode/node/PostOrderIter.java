package com.leetcode.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历 .
 *
 * @author simmon
 * @since 2022/4/28
 */
public class PostOrderIter {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
//        if(root==null)return list;
//        postorder(root, list);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left!=null) stack.push(node.left);
            if (node.right!=null) stack.push(node.right);
        }
        Collections.reverse(list);
        return list;

    }

    public void postorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }
}
