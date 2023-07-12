package org.string.tojadencase;

import org.junit.jupiter.api.Test;
import org.leetcode.string.tojadencase.JadenCase;

import static org.junit.jupiter.api.Assertions.*;

public class JadenCaseTest {
    JadenCase jadenCase = new JadenCase();

    @Test
    public void test() {
        assertEquals(jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"),"How Can Mirrors Be Real If Our Eyes Aren't Real");
       }

    @Test
    public void testNullArg() {
        assertNull(jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""));
    }
}