package com.amazon.tests.increase_quantity_of_outofstock_product;

import com.amazon.base.BaseTest;
import com.amazon.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class AddToCart extends BaseTest {
    @Test
    public void increaseQuantity() throws InterruptedException {
        HomePage.signinLink();
        _3_LoginPage.setUsername("PhilipMaher.a@gmail.com");
        _3_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("Philip@test");
        _4_ContinuePage.clickContinueButton();
        HomePage.AcessFashion();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        FashionPlp.AccessProduct();
        js.executeScript("window.scrollBy(0, 300)");
        ProductPage.AddToCart();
        SubProductpage.Increase();
        driver.navigate().back();
        ProductPage.AddToCart();
        Assert.assertTrue(_12_SubProductsPage.ismessgeDisplayed());
    }
}
