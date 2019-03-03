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
    log("Opened site");

    // Click on Sign In link
    LoginPage loginPage = homePage.clickSignInLink();
    log("Clicked Sgn In");

    // Sign In with login and password
    MyAccoutPage myAccoutPage = loginPage.signIn();
    log("Signed In on the site");

    // Click menu T-Shirts
    TShirtPage tShirtPage = myAccoutPage.clickMenuTShirt();
    log("Clicked menu T-Shirts");

    //  Click to Product
    ProductPage productPage = tShirtPage.clicktoProduct();
    log("Clicked to Product Container");

    // Check breadcrumb
    productPage.checkBreadrumb();
    log("Checked breadcrumb");

    // Click on button Add to Cart
    productPage.clickToButtonAddToCart();
    log("Clicked to button Add to Cart");

    // Click Button Proceed Checkout
    CheckoutPage checkoutPage = productPage.clickButtonProceedToCheckout();
    log("Clicked Proceed to Checkout");

    // Click to Increase Quantity
    checkoutPage.clickToIncreaseQuantity();
    log("Increased Quanttity");

    // Check Total Price
    checkoutPage.checkTotalPrice();
    log("Checked amount price");

    // Click Delete Product
    checkoutPage.clickDeleteProduct();
    log("Deleted Product");

    // Check Empty Cart
    checkoutPage.checkEmptyCart();
    log("Checked that we have message: Your shopping cart is empty");

    closeSite();
  }
}
