package org.example.solution.s0700.s0704BinarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        do {
            middle = (right + left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target)  {
                left = middle + 1;
            } else {
                right = middle - 1 ;
            }
        } while (left <= right);
        return -1;
    }
}
