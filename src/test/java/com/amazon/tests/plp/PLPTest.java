package com.amazon.tests.plp;

import com.amazon.base.BaseTest;
import com.amazon.pages.ProductsListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTest extends BaseTest {

    @Test
    public void testPLP() {
        // Step 1: Set search product
        com.amazon.pages.HomePage.setSearch("iphone16 pro max");

        // Step 2: Click search
        com.amazon.pages.HomePage.openProductsListing();

        // Step 3: Confirm PLP
        Assert.assertTrue(ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

    }
}


