package org.example.solution.s0100.s0141LinkedListCycle;

import org.example.solution.common.LinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasCycle() {
        Solution solution = new Solution();

        ListNode test = ListNode.createCycledList(new int[]{3,2,0,-4}, 1);
        Assertions.assertTrue(solution.hasCycle(test));

        test = ListNode.createCycledList(new int[]{1,2}, 0);
        Assertions.assertTrue(solution.hasCycle(test));

        test = ListNode.createCycledList(new int[]{1}, -1);
        Assertions.assertFalse(solution.hasCycle(test));

    }
}