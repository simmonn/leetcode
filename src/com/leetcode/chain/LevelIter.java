package com.leetcode.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[9,20],[15,7]]
 * 示例 2：
 *
 * 输入：root = [1]
 * 输出：[[1]]
 *
 * @author simmon
 * @since 2022/5/4
 */
public class LevelIter {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return list;
        }
        order(root, 0);
        return list;

    }

    public void order(TreeNode node, int level) {
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        if (node.left != null) {
            order(node.left, level + 1);
        }
        if (node.right != null) {
            order(node.right, level + 1);
        }
    }

}
