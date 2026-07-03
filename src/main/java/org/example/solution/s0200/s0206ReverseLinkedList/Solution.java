package org.example.solution.s0200.s0206ReverseLinkedList;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nextCurrent;
        ListNode currentNode = head;
        ListNode prevNode = null;
        while(currentNode != null) {
            nextCurrent = currentNode.next; // Svae Next node from not reversed list

            currentNode.next = prevNode;    // reverse link in current node
            prevNode = currentNode;         // Move prevNode forward
            currentNode = nextCurrent;      // Move currentNode forward
        }
        return prevNode;
    }
}
