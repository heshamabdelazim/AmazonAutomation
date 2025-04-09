package com.amazon.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signinLink = By.id("nav-link-accountList-nav-line-1");
    public static By accountLink = By.id("nav-link-accountList");


    public static boolean isAccountLinkVisible() {
        return driver.findElement(accountLink).isDisplayed();
    }

    public LoginPage signinLink() {
        click(signinLink);
        return new LoginPage();


    }
}