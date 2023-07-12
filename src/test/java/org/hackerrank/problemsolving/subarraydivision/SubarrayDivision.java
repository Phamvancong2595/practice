package org.hackerrank.problemsolving.subarraydivision;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubarrayDivision {
    @Test
    public void test1() {
        assertEquals(Result.birthday(List.of(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1),18,7), 3);
    }
}