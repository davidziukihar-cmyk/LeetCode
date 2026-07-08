package org.example.solution.s0000.s0083RemoveDuplicatesfromSortedList;

import org.example.solution.common.LinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteDuplicates() {
        Solution solution = new Solution();
        ListNode source = ListNode.createList(new int[]{1,1,2});
        Assertions.assertTrue(ListNode.checkListNodeOrder(solution.deleteDuplicates(source), new int[]{1,2}));

        source = ListNode.createList(new int[]{1,1,2,3,3});
        Assertions.assertTrue(ListNode.checkListNodeOrder(solution.deleteDuplicates(source), new int[]{1,2,3}));

    }
}