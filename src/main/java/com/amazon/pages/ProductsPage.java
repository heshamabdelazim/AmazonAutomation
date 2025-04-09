package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductsPage extends BasePage {

    public static By searchResults = By.xpath("(//span[@class='a-dropdown-prompt'])[1]");

    public static boolean isSearchResultsVisible() {
        return driver.findElement(searchResults).isDisplayed();
    }
}
