package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WishlistPage extends BasePage {

    public static By addConfirmation = By.xpath("//span[normalize-space()='1 item added to']");
    public static By viewList = By.xpath("(//a[normalize-space()='View your list'])[1]");

    public static boolean isWishlistConfirmationVisible() {
        return driver.findElement(addConfirmation).isDisplayed();
    }

    public static ProductDetailPage productDetails() {
        click(viewList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));
        return new ProductDetailPage();

    }

}
