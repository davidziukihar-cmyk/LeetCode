package org.example.solution.s0200.s0206ReverseLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.solution.common.LinkedList.ListNode.checkListNodeOrder;
import static org.example.solution.common.LinkedList.ListNode.createList;

class SolutionTest {

    @Test
    void reverseList() {
        Solution solution = new Solution();
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{1,2,3,4,5})), new int[]{5,4,3,2,1}));
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{1,2})), new int[]{2,1}));
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{})), new int[]{}));
    }
}