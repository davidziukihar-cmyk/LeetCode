package org.example.solution.s0000.s0020ValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isValid("()"));
        Assertions.assertTrue(solution.isValid("()[]{}"));
        Assertions.assertTrue(solution.isValid("([])"));
        Assertions.assertFalse(solution.isValid("([)]"));
        Assertions.assertFalse(solution.isValid("(])"));
    }
}