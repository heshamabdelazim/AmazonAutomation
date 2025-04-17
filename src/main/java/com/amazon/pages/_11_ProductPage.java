package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _11_ProductPage extends _1_BasePage {
    public static By AddtoCartbtn = By.cssSelector("input#add-to-cart-button");

    public _12_SubProductsPage AddToCart() {
        click(AddtoCartbtn);
        return new _12_SubProductsPage();
    };
}
