package org.example.solution.s0000.s0083RemoveDuplicatesfromSortedList;

import org.example.solution.common.LinkedList.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
