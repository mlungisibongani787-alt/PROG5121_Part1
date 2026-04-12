package com.mycompany.prog5121part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Prog5121part1Test {

    Prog5121part1 login = new Prog5121part1();

    @Test
    public void testUsernameValidation() {
        // This should pass (Green)
        assertTrue(login.checkUsername("ky_1")); 
        // This should fail (Red if you used assertTrue, so we use assertFalse)
        assertFalse(login.checkUsername("kyle_smith")); 
    }

    @Test
    public void testPasswordValidation() {
        // This should pass (Green)
        assertTrue(login.checkPasswordComplexity("Ch@ttApp2026!"));
    }
}