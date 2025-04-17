package com.amazon.base;

import com.amazon.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected _1_BasePage BasePage;
    protected _2_HomePage HomePage;
    protected _10_fashionPage FashionPlp;
    protected _11_ProductPage ProductPage;
    protected _12_SubProductsPage SubProductpage ;


    private String url = "https://www.amazon.eg/?language=en_AE";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        BasePage = new _1_BasePage();
        BasePage.setDriver(driver);
        HomePage = new _2_HomePage();
        FashionPlp = new _10_fashionPage();
        ProductPage = new _11_ProductPage();
        SubProductpage = new _12_SubProductsPage();

    }

    @AfterClass
    public void tearDown() {
        try {
            // Wait for a few seconds before closing
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Then quit the browser
        if (driver != null) {
            driver.quit();
        }

    }
}