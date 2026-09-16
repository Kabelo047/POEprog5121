/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Student
 */

public class LoginTest {

    Login login = new Login();

    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        assertFalse(login.checkUserName("kyle!!!!"));
    }

    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(login.checkPasswordComplexity("Ch&Sec@ke99!"));
    }

    @Test
    public void testPasswordDoesNotMeetComplexity() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testCellPhoneCorrectlyFormatted() {
        assertTrue(login.checkCellPhoneNumber("+27831234567"));
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        assertFalse(login.checkCellPhoneNumber("0831234567"));
    }

    @Test
    public void testLoginSuccess() {
        login.registerUser("kyl_1", "Ch&Sec@ke99!", "+27831234567");
        assertTrue(login.loginUser("kyl_1", "Ch&Sec@ke99!"));
    }

    @Test
    public void testLoginFailed() {
        login.registerUser("kyl_1", "Ch&Sec@ke99!", "+27831234567");
        assertFalse(login.loginUser("kyl_1", "Wrong123!"));
    }
}
 

