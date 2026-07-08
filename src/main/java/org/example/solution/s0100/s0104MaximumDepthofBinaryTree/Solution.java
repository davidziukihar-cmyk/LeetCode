package org.example.solution.s0100.s0104MaximumDepthofBinaryTree;

import org.example.solution.common.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    private int depth(TreeNode node, int d) {
        if (node == null) {
            return d;
        } else {
            return Math.max(depth(node.left, d + 1), depth(node.right, d + 1));
        }
    }

//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }
}
