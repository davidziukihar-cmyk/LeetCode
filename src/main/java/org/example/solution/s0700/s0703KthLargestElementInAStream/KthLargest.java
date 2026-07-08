package org.example.solution.s0700.s0703KthLargestElementInAStream;

import java.util.PriorityQueue;

public class KthLargest {

    private PriorityQueue<Integer> queue;
    private final int k;

    public KthLargest(int k, int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
            queue.add(n);
        }
        int lowest = Math.max(0, nums.length - k);
        for (int i = 0; i < lowest; i++) {
            queue.poll();
        }
        this.queue = queue;
        this.k = k;

    }
    public int add(int val) {
        queue.add(val);
        if (queue.size() > k) {
            queue.remove();
        }
        return queue.peek();
    }
}
