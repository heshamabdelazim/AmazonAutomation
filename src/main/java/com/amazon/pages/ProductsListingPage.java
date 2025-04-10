package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductsListingPage extends BasePage {

    public static By searchResults = By.xpath("(//span[@class='a-dropdown-prompt'])[1]");
    public static By searchProduct = By.xpath("//span[normalize-space()='iPhone 16 Pro Max (256 GB) - Black Titanium']");
    public static By addToList = By.xpath("//input[@id='add-to-wishlist-button-submit']");

    public static boolean isPLPVisible() {
        return driver.findElement(searchResults).isDisplayed();
    }


    public static ProductDetailPage productDetails() {
        click(searchProduct);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));
        return new ProductDetailPage();

    }

    public static WishlistConfirmation openWishConfirmation() {
        click(addToList);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='View your list']")));
        return new WishlistConfirmation();

    }
}
