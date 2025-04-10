package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.ContinuePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.ProductsListingPage;
import com.amazon.pages.WishlistConfirmation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToWishlist extends BaseTest {

    @Test
    public void testAddToWishlist() {

        // Pre-requirement already created default shopping list
        // Pre-requirement product isn't in wishlist already

        // Step 1: Click Sign-in
        HomePage.signinLink();

        // Step 2: Enter username/phone
        LoginPage.setUsername("+201096933795");
        LoginPage.signinButton();

        // Step 3: Enter password
        ContinuePage.setPassword("aA1!testest00");
        ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(com.amazon.pages.HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        // Step 5: Set search product
        com.amazon.pages.HomePage.setSearch("iphone16 pro max");

        // Step 6: Click search
        com.amazon.pages.HomePage.productsListing();

        // Step 7: Confirm PLP
        Assert.assertTrue(ProductsListingPage.isPLPVisible(), "Can not navigate to PLP");

        // Step 8: Click Product
        com.amazon.pages.ProductsListingPage.productDetails();

        // Step 9: Click Add to List
        com.amazon.pages.ProductsListingPage.openWishConfirmation();

        // Step 10: Confirm PLP
        Assert.assertTrue(WishlistConfirmation.isProductAdded(), "Product is not added to Wishlist");



    }
}


