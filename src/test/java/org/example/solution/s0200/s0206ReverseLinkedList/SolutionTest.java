package org.example.solution.s0200.s0206ReverseLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverseList() {
        Solution solution = new Solution();
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{1,2,3,4,5})), new int[]{5,4,3,2,1}));
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{1,2})), new int[]{2,1}));
        Assertions.assertTrue(checkListNodeOrder(solution.reverseList(createList(new int[]{})), new int[]{}));
    }

    private ListNode createList(int[] array) {
        if (array.length == 0) return null;
        ListNode head = new ListNode(array[0]);
        ListNode node = head;
        for (int i = 1; i < array.length; i++) {
            ListNode next = new ListNode(array[i]);
            node.next = next;
            node = next;
        }
        return head;
    }

    private boolean checkListNodeOrder(ListNode node, int[] order) {
        int n = 0;
        while (node != null && n < order.length) {
            if (node.val != order[n]) {
                return false;
            }
            node = node.next;
            n++;
        }
        if (node == null && n == order.length) {
            return true;
        }
        return false;
    }
}