package com.aqacources.tests.pages;

import com.aqacources.tests.base.BaseTest;
import org.openqa.selenium.interactions.Actions;

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

  /**
   * Click to Product Page
   *
   * @return new instance of Product page
   */
  public ProductPage clicktoProduct() {
    testClass.waitTillElementIsVisible(productCOntainer);
    Actions action = new Actions(testClass.getDriver());
    action.moveToElement(productCOntainer).perform();
    buttonViewForProduct.click();
    return new ProductPage(testClass);
  }
}
