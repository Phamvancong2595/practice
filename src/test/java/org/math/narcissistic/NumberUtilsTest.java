package org.math.narcissistic;

import org.junit.jupiter.api.Test;
import org.leetcode.math.narcissistic.NumberUtils;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NumberUtils.isNarcissistic(112), "112 is not narcissistic");
    }
}