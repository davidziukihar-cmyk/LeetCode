package org.example.solution.s0200.s0226InvertBinaryTree;

import org.example.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

class SolutionTest {

    @Test
    void invertTree() {
        Solution solution = new Solution();

        TreeNode source = TreeNode.buildTree(new Integer[]{4,2,7,1,3,6,9});
        Integer[] expected = new Integer[]{4,7,2,9,6,3,1};
        TreeNode inverted = solution.invertTree(source);
        Assertions.assertTrue(isSame(expected, TreeNode.treeToList(inverted)));

        source = TreeNode.buildTree(new Integer[]{2,1,3});
        expected = new Integer[]{2,3,1};
        inverted = solution.invertTree(source);
        Assertions.assertTrue(isSame(expected, TreeNode.treeToList(inverted)));

        source = TreeNode.buildTree(new Integer[]{});
        expected = new Integer[]{};
        inverted = solution.invertTree(source);
        Assertions.assertTrue(isSame(expected, TreeNode.treeToList(inverted)));


    }

    private boolean isSame(Integer[] expected, List<Integer> result){
        if (expected.length != result.size()) return false;
        int j = 0;
        for (Integer i : expected) {
            if (!Objects.equals(i, result.get(j))) {
                return false;
            }
            j++;
        }
        return true;
    }
}