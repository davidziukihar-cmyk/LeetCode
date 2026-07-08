package org.example.solution.s0100.s0104MaximumDepthofBinaryTree;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxDepth() {

        Solution solution = new Solution();
        TreeNode treeNode = TreeNode.buildTree(new Integer[]{3,9,20,null,null,15,7});
        Assertions.assertEquals(3, solution.maxDepth(treeNode));

        treeNode = TreeNode.buildTree(new Integer[]{1,null,2});
        Assertions.assertEquals(2, solution.maxDepth(treeNode));

        treeNode = TreeNode.buildTree(new Integer[]{1,2});
        Assertions.assertEquals(2, solution.maxDepth(treeNode));

    }
}