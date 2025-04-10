package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WishlistPage extends BasePage {

    public static By yourListConfirm = By.xpath("//a[@href='/-/en/hz/wishlist/ls/ref=cm_wl_your_lists']");

    public static boolean isWishlistPageVisible() {
        return driver.findElement(yourListConfirm).isDisplayed();
    }

}
