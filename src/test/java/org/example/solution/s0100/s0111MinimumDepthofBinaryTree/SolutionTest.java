package org.example.solution.s0100.s0111MinimumDepthofBinaryTree;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minDepth() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNode.buildTree(new Integer[]{3,9,20,null,null,15,7});
        Assertions.assertEquals(2, solution.minDepth(treeNode));

        treeNode = TreeNode.buildTree(new Integer[]{2,null,3,null,4,null,5,null,6});
        Assertions.assertEquals(5, solution.minDepth(treeNode));
    }
}