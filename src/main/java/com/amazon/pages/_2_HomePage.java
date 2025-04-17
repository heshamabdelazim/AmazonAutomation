package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class _2_HomePage extends _1_BasePage {

    private By signinLink = By.id("nav-link-accountList-nav-line-1");
    public static By accountLink = By.id("nav-link-accountList");
    public static By searchField = By.id("twotabsearchtextbox");
    public static By searchButton = By.id("nav-search-submit-button");
    public static By accountPage = By.xpath("//a[@href='https://www.amazon.eg/-/en/gp/css/homepage.html?ref_=nav_youraccount_btn']");
    public static By fashionBtn = By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion'] ");

    public static boolean isAccountLinkVisible() {
        return driver.findElement(accountLink).isDisplayed();
    }

    public _3_LoginPage signinLink() {
        click(signinLink);
        return new _3_LoginPage();
    }
    public _10_fashionPage AcessFashion() {
        click(fashionBtn);
        return new _10_fashionPage();
    };

    public static void setSearch(String search){
        set(searchField, search);
    }

    public static _6_ProductsListingPage openProductsListing() {
        click(searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-dropdown-prompt'])[1]")));
        return new _6_ProductsListingPage();

    }

    public static _5_AccountPage openAccountPage() {
        click(accountPage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[normalize-space()='Your Account']")));
        return new _5_AccountPage();
    }
}