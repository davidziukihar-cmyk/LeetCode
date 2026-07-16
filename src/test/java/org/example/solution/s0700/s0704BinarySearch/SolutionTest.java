package org.example.solution.s0700.s0704BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        Solution solution = new Solution();
        Assertions.assertEquals(4, solution.search(new int[]{-1,0,3,5,9,12}, 9));
        Assertions.assertEquals(-1, solution.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}