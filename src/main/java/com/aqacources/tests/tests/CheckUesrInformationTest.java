package com.aqacources.tests.tests;

import com.aqacources.tests.base.BaseTest;
import com.aqacources.tests.pages.HomePage;
import com.aqacources.tests.pages.LoginPage;
import com.aqacources.tests.pages.MyAccoutPage;
import org.junit.Assert;
import org.junit.Test;

/** Created by Marina on 19.02.2019. */
public class CheckUesrInformationTest extends BaseTest {

  /** Open site and authorize user, check customer name and sign out */
  @Test
  public void testOpenSiteAndClickTheLinkTest() {

    String loginPageTitle;
    String myAccountPageTitle;

    // Initialize Home page
    HomePage homePage = openSite();
    log("Open site");

    // Click on Sign In link
    LoginPage loginPage = homePage.clickSignInLink();
    log("Click Sign In");

    // get Title for Login Page
    loginPageTitle = loginPage.getTitle();
    log("Get Title for page after Log In - Login Page");

    // Sign In with login and password
    MyAccoutPage myAccoutPage = loginPage.signIn();
    log("User Authorization");

    // check customer name
    myAccoutPage.checkCustomerName();
    log("Check Customer Name");

    // log out
    myAccoutPage.logOut();
    log("Log Out");

    // get Title after Sign Out
    myAccountPageTitle = myAccoutPage.getTitle();
    log("Get Title from page after log out  Login Page");

    // check that page after click Sign In and page when user is Log Out is the same
    Assert.assertEquals(loginPageTitle, myAccountPageTitle);
    log("Check that page after clickSignIn Link and after log out is the same");

    closeSite();
    log("Close site");
  }
}
