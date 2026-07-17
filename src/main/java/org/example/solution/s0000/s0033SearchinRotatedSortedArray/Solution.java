package org.example.solution.s0000.s0033SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            // Left half is sorted
            if (nums[lo] <= nums[mid]) {
                if (nums[lo] <= target && target < nums[mid]) { //if target in this half
                    hi = mid - 1; // will find in this half
                } else {
                    lo = mid + 1; // will find in other half
                }
            } else { //Right half is sorted
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
