package com.amazon.tests.pdp;

import com.amazon.base.BaseTest;
import com.amazon.pages.ProductsListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.pages.ProductDetailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDPTest extends BaseTest {
    @Test
    public void testPDP() {

        // Step 1: Set search product
        com.amazon.pages.HomePage.setSearch("iphone16 pro max");

        // Step 2: Click search
        com.amazon.pages.HomePage.productsListing();

        // Step 3: Confirm PLP
        Assert.assertTrue(ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

        // Step 4: Click Product
        com.amazon.pages.ProductsListingPage.productDetails();

        // Step 5: Confirm PDP

    }
}
