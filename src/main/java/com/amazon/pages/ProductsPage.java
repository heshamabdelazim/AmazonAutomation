package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static com.amazon.pages.BasePage.driver;

public class ProductsPage {
    public static By searchProduct = By.xpath("//span[@class='a-color-state a-text-bold']");

    public static boolean searchProductText() {
        return driver.findElement(searchProduct).isDisplayed();
    }
}
