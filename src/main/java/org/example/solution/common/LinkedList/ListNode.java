package org.example.solution.common.LinkedList;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode() {}
  public ListNode(int val) { this.val = val; }
  public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  public static ListNode createList(int[] array) {
    if (array.length == 0) return null;
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
      for (int j : array) {
          tail.next = new ListNode(j);
          tail = tail.next;
      }
    return dummy.next;
  }

  public static boolean checkListNodeOrder(ListNode node, int[] order) {
    int n = 0;
    while (node != null && n < order.length) {
      if (node.val != order[n]) {
        return false;
      }
      node = node.next;
      n++;
    }
      return node == null && n == order.length;
  }

  public static ListNode createCycledList(int[] array, int pos) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    ListNode cycledInput = null;
    for (int i = 0; i < array.length; i++) {
      tail.next = new ListNode(array[i]);
      tail = tail.next;
      if (i == pos) {
        cycledInput = tail;
      }
      if (i == array.length - 1) {
        tail.next = cycledInput;
      }
    }
    return dummy.next;
  }
}

