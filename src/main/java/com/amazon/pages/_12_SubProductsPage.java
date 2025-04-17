package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class _12_SubProductsPage extends _1_BasePage {
    public static By Increment = By.xpath("//span[@class='a-icon a-icon-small-add']");
    public static By UcannotAddmessage = By.xpath("//span[@id='sw-atc-transactional-message']");
    public static boolean ismessgeDisplayed() {
        return driver.findElement(UcannotAddmessage).isDisplayed();
    }
    public void Increase() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            click(Increment);
            Thread.sleep(500);
        }
    };









}
