package org.hackerrank.problemsolving.DiagionalDifferent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiagonalDifferent {
    @Test public void test1() {
        assertEquals(Result.diagonalDifference(List.of(List.of(11,2,4),List.of(4,5,6),List.of(10,8, -12))), 15);
    }
}