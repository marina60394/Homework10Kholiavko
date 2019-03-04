package com.aqacources.tests.pages;

import com.aqacources.tests.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/** Created by Marina on 26.02.2019. */
public class TShirtPage extends AbstractPage {

  /**
   * Constructor
   *
   * @param testClass
   */
  public TShirtPage(BaseTest testClass) {
    super(testClass);
  }

  private String PRODUCT_DETAILS =
      "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='%s']";
  private String productName = "Faded Short Sleeve T-shirts";

  /**
   * Click to Product Page
   *
   * @return new instance of Product page
   */
  public ProductPage clicktoProduct() {
    testClass
        .getDriver()
        .findElement(By.xpath(String.format(PRODUCT_DETAILS, productName)))
        .click();
    return new ProductPage(testClass);
  }
}
