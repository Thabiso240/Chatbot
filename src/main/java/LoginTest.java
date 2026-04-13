package com.chatapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LoginTest {

    Login login = new Login();

    // Username Tests
    @Test
    public void testUsernameCorrect() {
        boolean result = login.checkUserName("kyl_1");
        assertTrue(result);
    }

    @Test
    public void testUsernameIncorrect() {
        boolean result = login.checkUserName("kyle!!!!!!!");
        assertFalse(result);
    }

    // Password Tests
    @Test
    public void testPasswordCorrect() {
        boolean result = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(result);
    }

    @Test
    public void testPasswordIncorrect() {
        boolean result = login.checkPasswordComplexity("password");
        assertFalse(result);
    }

    // Cellphone Tests
    @Test
    public void testCellPhoneCorrect() {
        boolean result = login.checkCellPhoneNumber("+27838968976");
        assertTrue(result);
    }

    @Test
    public void testCellPhoneIncorrect() {
        boolean result = login.checkCellPhoneNumber("08966553");
        assertFalse(result);
    }

    // Login Tests
    @Test
    public void testLoginSuccess() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        boolean result = login.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
    }

    @Test
    public void testLoginFail() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        boolean result = login.loginUser("wrongUser", "wrongPass");
        assertFalse(result);
    }



}