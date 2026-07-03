package org.example.solution.s0000.s0020ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                deque.add(c);
            } else {
                Character last = deque.peekLast();
                if (last == null) return false; // closed before open
                if (last.equals('[') && c.equals(']')) {
                    deque.pollLast();
                } else if (last.equals('(') && c.equals(')')) {
                    deque.pollLast();
                } else if (last.equals('{') && c.equals('}')) {
                    deque.pollLast();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
