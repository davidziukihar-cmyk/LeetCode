package org.example.solution.s0000.s0069Sqrt_x;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long lo = 0;
        long hi = x;
        while (lo < hi){
            long middle = (lo + hi) / 2;
            if (middle * middle <= x) {
                lo = middle + 1;
            } else {
                hi = middle;
            }
        }
        if (lo > 0 && lo * lo > x && (lo - 1) * (lo - 1) <= x) {
            return (int) lo-1;
        } else {
            return -1;
        }
    }
}
