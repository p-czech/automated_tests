package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.UtilActions;


public class ProductPage {

  public ProductPage (){
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(addToCartButton);
  }

  @FindBy(id = "quantity_wanted")
  private WebElement quantityInput;

  @FindBy(css = "a.btn:nth-child(3)")
  private WebElement increaseQuantityByOneButton;

  @FindBy(css = "a.btn:nth-child(4)")
  private WebElement decreaseQuantityByOneButton;

  @FindBy(id = "group_1")
  private WebElement sizeSelect;

  @FindBy(id = "color_13")
  private WebElement colorOrange;

  @FindBy(id = "color_14")
  private WebElement colorBlue;

  @FindBy(css = "button.exclusive")
  private WebElement addToCartButton;

  @FindBy(css = "a.btn:nth-child(2)")
  private WebElement proceedToCheckoutButton;


  private void fillInOrderPageWithSmallSizeAndBlueColor() {
    quantityInput.clear();
    quantityInput.sendKeys("1");
    new Select(sizeSelect).selectByValue("2");
    colorBlue.click();

  }
  public CheckOutPage orderOneSmallBlueTShirt() {

    fillInOrderPageWithSmallSizeAndBlueColor();
    addToCartButton.click();
    UtilActions.waitForVisibilityOfElement(proceedToCheckoutButton);
    //check if quantity is the same
    proceedToCheckoutButton.click();
    return new CheckOutPage();
  }

}
