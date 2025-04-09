package com.amazon.tests.plp;

import com.amazon.base.BaseTest;
import com.amazon.pages.ContinuePage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTest extends BaseTest {

    @Test
    public void testPLP() {
        // Step 1: Set search product
        com.amazon.pages.HomePage.setSearch("iphone16 pro max");

        // Step 2: Click search
        com.amazon.pages.HomePage.productsListing();

        // Step 3: Confirm PLP
        Assert.assertTrue(com.amazon.pages.ProductsPage.isSearchProductVisible(), "Can not find product");

    }
}


