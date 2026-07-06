package org.example.solution.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void buildTree() {
    }

    @Test
    void treeToList() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        System.out.println(TreeNode.treeToList(root)); // [1, 2]
        Assertions.assertEquals("[1, 2]", TreeNode.treeToList(root).toString());

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        System.out.println(TreeNode.treeToList(root2)); // [1, null, 2]
        Assertions.assertEquals("[1, null, 2]", TreeNode.treeToList(root2).toString());

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.left.right = new TreeNode(5);

        System.out.println(TreeNode.treeToList(root3)); // [1, 2, null, null, 5]
        Assertions.assertEquals("[1, 2, null, null, 5]", TreeNode.treeToList(root3).toString());

        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(8);
        root4.left.right = new TreeNode(5);
        root4.right.right = new TreeNode(10);
        root4.left.right.left = new TreeNode(3);


        System.out.println(TreeNode.treeToList(root4)); // [1, 2, 8, null, 5, null, 10, 3
        Assertions.assertEquals("[1, 2, 8, null, 5, null, 10, 3]", TreeNode.treeToList(root4).toString());
    }
}