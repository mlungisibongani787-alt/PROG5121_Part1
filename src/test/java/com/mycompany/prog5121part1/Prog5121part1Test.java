package com.mycompany.prog5121part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Prog5121part1Test {
    Prog5121part1 app = new Prog5121part1();

    @Test
    public void testUsernameSuccess() {
        assertTrue(app.checkUsername("bn_26")); // Correct format
    }

    @Test
    public void testPasswordSuccess() {
        assertTrue(app.checkPasswordComplexity("Pass#2026")); // Correct complexity
    }

    @Test
    public void testPhoneLength() {
        assertTrue(app.checkPhoneNumber("0712345678")); // Valid 10 digits
        assertFalse(app.checkPhoneNumber("07123"));    // Invalid too short
    }
}