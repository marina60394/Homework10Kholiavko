package com.aqacources.tests.tests;

import com.aqacources.tests.base.BaseTest;
import com.aqacources.tests.pages.*;
import org.junit.Test;

/** Created by Marina on 24.02.2019. */
public class GetProductsAmountTest extends BaseTest {

  @Test
  public void testGetProductAmount() throws InterruptedException {

    // Initialize Home Page
    HomePage homePage = openSite();
    log("Open site");

    LoginPage loginPage = homePage.clickSignInLink();
    log("Click Sgn In");

    // Sign In with login and password
    MyAccoutPage myAccoutPage = loginPage.signIn();
    log("Authorization on the site");

    // click to Menu Dresses
    DressesPage dressesPage = myAccoutPage.clickMenuDresses();
    log("Click menu Dressses");

    //  Click to Summer Dresses
    SummerDressesPage summerDressesPage = dressesPage.clickmenuSummerDresses();
    log("Click Summer Dresses");

    // compare product amount from message and products
    summerDressesPage.compareProductAmounts();
    log("Compare summer dresses amounts from the page and from the message");

    // click to filter color White
    summerDressesPage.clickFilterColorWhite();
    log("CLick to Filter color White");

    // compare product amount from message and products
    summerDressesPage.compareProductAmounts();
    log("Compare summer white dresses from the page and from the message");

    closeSite();
  }
}
