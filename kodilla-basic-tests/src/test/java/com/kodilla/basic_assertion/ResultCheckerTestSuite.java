package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultCheckerTestSuite {

    @Test
    void testAssertEquals() {
        assertTrue(ResultChecker.assertEquals(5, 5));
        assertFalse(ResultChecker.assertEquals(5, 6));
    }

    @Test
    void testAssertEqualsPower() {
        assertTrue(ResultChecker.assertEqualsPower(3.14, 3.14));
        assertFalse(ResultChecker.assertEqualsPower(3.14, 3.1415));
    }
}
