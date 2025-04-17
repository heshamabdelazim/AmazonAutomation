package com.amazon.pages;

import org.openqa.selenium.By;


public class _10_fashionPage extends _1_BasePage {
    public static By ProductImage = By.cssSelector("img[alt=\"SKECHERS BOBS B FLEX LO for WOMEN\"]");
    public _11_ProductPage AccessProduct() {
        click(ProductImage);
        return new _11_ProductPage();
    };
};
