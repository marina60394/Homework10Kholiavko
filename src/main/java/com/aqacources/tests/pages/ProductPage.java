package com.aqacources.tests.pages;

import com.aqacources.tests.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/** Created by Marina on 26.02.2019. */
public class ProductPage extends AbstractPage {

  //  Web elements
  @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
  private WebElement breadcrumb;

  @FindBy(xpath = "//p[@id='add_to_cart']/button")
  private WebElement buttonAddToCart;

  @FindBy(xpath = "//div[@class='button-container']/a[@title='Proceed to checkout']")
  private WebElement buttonProceedToCheckout;

  /**
   * Constructor
   *
   * @param testClass
   */
  public ProductPage(BaseTest testClass) {
    super(testClass);
  }

  /** Click to button Add to Cart */
  public void clickToButtonAddToCart() {
    buttonAddToCart.click();
  }

  /**
   * Click to button Proceed Checkout
   *
   * @return new instance of Checkout page
   */
  public CheckoutPage clickButtonProceedToCheckout() {
    testClass.waitTillElementIsVisible(buttonProceedToCheckout);
    buttonProceedToCheckout.click();
    return new CheckoutPage(testClass);
  }
}
