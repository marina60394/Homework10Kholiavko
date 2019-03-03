package com.aqacources.tests.pages;

import com.aqacources.tests.base.BaseTest;
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

  // Web Elements
  @FindBy(xpath = "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']")
  private WebElement productCOntainer;

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
