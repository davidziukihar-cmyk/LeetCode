package org.example.solution.s0100.s0113PathSumII;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void pathSum() {
        Solution solution = new Solution();
        TreeNode root = TreeNode.buildTree(new Integer[] {5,4,8,11,null,13,4,7,2,null,null,5,1});
        Assertions.assertEquals("[[5, 4, 11, 2], [5, 8, 4, 5]]", solution.pathSum(root, 22).toString());

        root = TreeNode.buildTree(new Integer[] {1,2,3});
        Assertions.assertEquals("[]", solution.pathSum(root, 5).toString());

        root = TreeNode.buildTree(new Integer[] {1,2});
        Assertions.assertEquals("[]", solution.pathSum(root, 0).toString());
    }
}