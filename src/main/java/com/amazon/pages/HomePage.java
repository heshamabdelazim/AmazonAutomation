package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private By signinLink = By.id("nav-link-accountList-nav-line-1");
    public static By accountLink = By.id("nav-link-accountList");
    public static By searchField = By.id("twotabsearchtextbox");
    public static By searchButton = By.id("nav-search-submit-button");

    public static boolean isAccountLinkVisible() {
        return driver.findElement(accountLink).isDisplayed();
    }

    public LoginPage signinLink() {
        click(signinLink);
        return new LoginPage();
    }

    public static void setSearch(String search){
        set(searchField, search);
    }

    public static ProductsListingPage productsListing() {
        click(searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-dropdown-prompt'])[1]")));
        return new ProductsListingPage();

    }
}