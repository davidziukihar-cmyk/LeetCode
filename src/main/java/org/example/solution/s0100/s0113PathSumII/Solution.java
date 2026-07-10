package org.example.solution.s0100.s0113PathSumII;

import org.example.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> results;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        results = new ArrayList<>();
        printPath(root, new ArrayList<>(), targetSum);
        results.forEach(System.out::println);
        System.out.println(results);
        return results;
    }

    private void printPath(TreeNode root, List<Integer> path, int target) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (target - root.val == 0) {
                results.add(List.copyOf(path));
            }
        } else {
            printPath(root.left, path, target - root.val);
            printPath(root.right, path, target - root.val);
        }
        path.removeLast();
    }
}
