package org.example.solution.s0500.s0572SubtreeofAnotherTree;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isSubtree() {
        Solution solution = new Solution();
        TreeNode root = TreeNode.buildTree(new Integer[]{3,4,5,1,2});
        TreeNode subRoot = TreeNode.buildTree(new Integer[]{4,1,2});

        Assertions.assertTrue(solution.isSubtree(root, subRoot));

        root = TreeNode.buildTree(new Integer[]{3,4,5,1,2,null,null,null,null,0});
        subRoot = TreeNode.buildTree(new Integer[]{4,1,2});

        Assertions.assertFalse(solution.isSubtree(root, subRoot));

    }
}