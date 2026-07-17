package org.example.solution.s0000.s0069Sqrt_x;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void mySqrt() {
        Solution solution = new Solution();
        Assertions.assertEquals(0, solution.mySqrt(0));
        Assertions.assertEquals(1, solution.mySqrt(1));
        Assertions.assertEquals(2, solution.mySqrt(8));
        Assertions.assertEquals(46339, solution.mySqrt(2147395599));

    }
}
