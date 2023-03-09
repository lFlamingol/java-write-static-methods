package com.bytelegend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {
    @Test
    public void testAdd() {
        assertEquals(6, Challenge.add(4, 2));
    }
}