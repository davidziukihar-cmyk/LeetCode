package org.example.solution.s0700.s0703KthLargestElementInAStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void add() {
        int k = 3;
        int[] nums = new int[]{4,5,8,2};
        KthLargest fastestObj = new KthLargest(k, nums);
        Assertions.assertEquals(4,fastestObj.add(3));
        Assertions.assertEquals(5,fastestObj.add(5));
        Assertions.assertEquals(5,fastestObj.add(10));
        Assertions.assertEquals(8,fastestObj.add(9));
        Assertions.assertEquals(8,fastestObj.add(4));

        k = 1;
        nums = new int[]{};
        fastestObj = new KthLargest(k, nums);
        Assertions.assertEquals(-3,fastestObj.add(-3));
        Assertions.assertEquals(-2,fastestObj.add(-2));
        Assertions.assertEquals(-2,fastestObj.add(-4));
        Assertions.assertEquals(0,fastestObj.add(0));
        Assertions.assertEquals(4,fastestObj.add(4));
    }
}