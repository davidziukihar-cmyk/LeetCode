package org.example.solution.s0100.s112PathSum;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void hasPathSum() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNode.buildTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        Assertions.assertTrue(solution.hasPathSum(treeNode, 22));

        treeNode = TreeNode.buildTree(new Integer[]{1,2,3});
        Assertions.assertFalse(solution.hasPathSum(treeNode, 5));

        treeNode = TreeNode.buildTree(new Integer[]{});
        Assertions.assertFalse(solution.hasPathSum(treeNode, 0));

        treeNode = TreeNode.buildTree(new Integer[]{1,2});
        Assertions.assertFalse(solution.hasPathSum(treeNode, 1));
    }
}