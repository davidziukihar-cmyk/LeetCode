package org.example.solution.s0200.s0257BinaryTreePaths;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void binaryTreePaths() {
        Solution solution = new Solution();
        TreeNode treeNode = TreeNode.buildTree(new Integer[]{1,2,3,null,5});
        String answer = "[1->2->5, 1->3]";
        Assertions.assertEquals(answer, solution.binaryTreePaths(treeNode).toString());

        TreeNode treeNode2 = TreeNode.buildTree(new Integer[]{1});
        String answer2 = "[1]";
        Assertions.assertEquals(answer2, solution.binaryTreePaths(treeNode2).toString());

        treeNode = TreeNode.buildTree(new Integer[]{1,2,3});
        answer = "[1->2, 1->3]";
        Assertions.assertEquals(answer, solution.binaryTreePaths(treeNode).toString());


    }
}