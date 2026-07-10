package org.example.solution.s0200.s0257BinaryTreePaths;

import org.example.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<String> stringList;

    public List<String> binaryTreePaths(TreeNode root) {
        stringList = new ArrayList<>();
        printPath(root, new StringBuilder());
        stringList.forEach(System.out::println);
        System.out.println(stringList);
        return stringList;
    }

    private void printPath(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        int previousLength = sb.length();
        if (!sb.isEmpty()) {
            sb.append("->");
        }
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            stringList.add(sb.toString());
        } else {
            sb.append(root.val);
            printPath(root.left, sb);
            printPath(root.right, sb);

        }
        sb.setLength(previousLength);
    }
}
