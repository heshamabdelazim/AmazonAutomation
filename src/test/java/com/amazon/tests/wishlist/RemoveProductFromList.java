package com.amazon.tests.wishlist;

import com.amazon.base.BaseTest;
import com.amazon.pages.ContinuePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.WishlistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductFromList extends BaseTest {

    @Test
    public void testRemoveProductFromList() {

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

        // Step 5: Click account link
        com.amazon.pages.HomePage.openAccountPage();

        // Step 6: Confirm account page
        Assert.assertTrue(com.amazon.pages.AccountPage.isYourAccountVisible(), "Account page not visible");

        // Step 7 : Open wishlist
        com.amazon.pages.AccountPage.openWishlistPage();

        // Step 8 : Confirm wishlist page
        Assert.assertTrue(com.amazon.pages.WishlistPage.isWishlistPageVisible(), "Wishlist not visible");

        // Step 9 : Delete Product
        com.amazon.pages.WishlistPage.deleteProduct();

        // Step 10 : Confirm Deletion
        Assert.assertTrue(WishlistPage.isProductDeleted(), "Product not deleted");
    }
}


