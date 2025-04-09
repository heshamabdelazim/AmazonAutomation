package com.amazon.tests.login;

import com.amazon.pages.ContinuePage;
import com.amazon.pages.LoginPage;
import com.amazon.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginPage() {
        // Step 1: Click Sign-in
        HomePage.signinLink();

        // Step 2: Enter username/phone
        LoginPage.setUsername("+201096933795");
        LoginPage.signinButton();

        // Step 3: Enter password
        ContinuePage.setPassword("aA1!testest00");
        ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(com.amazon.pages.HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

    }
}


