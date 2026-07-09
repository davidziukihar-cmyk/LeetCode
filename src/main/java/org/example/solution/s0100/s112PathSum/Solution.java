package org.example.solution.s0100.s112PathSum;

import org.example.solution.common.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        // no need - equal as: (left = 0 || check right)
//        if (root.left == null) {
//            return hasPathSum(root.right, targetSum - root.val);
//        }
//        if (root.right == null) {
//            return hasPathSum(root.left, targetSum - root.val);
//        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}
