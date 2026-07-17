package org.example.solution.s0000.s0033SearchinRotatedSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void search() {
        Solution solution = new Solution();

        Assertions.assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        Assertions.assertEquals(-1, solution.search(new int[]{4,5,6,7,0,1,2}, 3));
        Assertions.assertEquals(-1, solution.search(new int[]{1}, 0));
        Assertions.assertEquals(2, solution.search(new int[]{5,1,3}, 3));
        Assertions.assertEquals(5, solution.search(new int[]{4,5,6,7,0,1,2}, 1));
    }
}