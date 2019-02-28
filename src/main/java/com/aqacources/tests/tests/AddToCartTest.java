package com.aqacources.tests.tests;

import com.aqacources.tests.base.BaseTest;
import com.aqacources.tests.pages.*;
import org.junit.Test;

/** Created by Marina on 26.02.2019. */
public class AddToCartTest extends BaseTest {

  @Test
  public void testAddToCart() throws InterruptedException {

    // Initialize Home Page
    HomePage homePage = openSite();
    log("Open site");

    // Click on Sign In link
    LoginPage loginPage = homePage.clickSignInLink();
    log("Click Sgn In");

    // Sign In with login and password
    MyAccoutPage myAccoutPage = loginPage.signIn();
    log("Authorization on the site");

    // Click menu T-Shirts
    TShirtPage tShirtPage = myAccoutPage.clickMenuTShirt();
    log("Click menu T-Shirts");

    //  Click to Product
    ProductPage productPage = tShirtPage.clicktoProduct();
    log("Click to Product Container");

    // Check breadcrumb
    productPage.checkBreadrumb();
    log("Check breadcrumb");

    // Click on button Add to Cart
    productPage.clickToButtonAddToCart();
    log("Click to button Add to Cart");

    // Click Button Proceed Checkout
    CheckoutPage checkoutPage = productPage.clickButtonProceedToCheckout();
    log("Click Proceed to Checkout");

    // Click to Increase Quantity
    checkoutPage.clickToIncreaseQuantity();
    log("Increase Quanttity");

    // Check Total Price
    checkoutPage.checkTotalPrice();
    log("Check amount price");

    // Click Delete Product
    checkoutPage.clickDeleteProduct();
    log("Delete Product");

    // Check Empty Cart
    checkoutPage.checkEmptyCart();
    log("Check that we have message: Your shopping cart is empty");

    closeSite();
  }
}
