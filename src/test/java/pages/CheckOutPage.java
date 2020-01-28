package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilActions;

public class CheckOutPage {


  @FindBy(css = ".sf-menu")
  private WebElement menu;

  @FindBy(css = ".standard-checkout")
  private WebElement proceedButton;

  @FindBy(css = "button.button:nth-child(4)")
  private WebElement proceedButton2;
  
  @FindBy(id = "cgv")
  private WebElement termsAndConditionCheckBox;

  @FindBy(css = ".bankwire")
  private WebElement payByBankWireButton;

  @FindBy(css = "button.button-medium")
  private WebElement confirmMyOrderButton;

  @FindBy(css = ".cheque-indent > strong:nth-child(1)")
  private WebElement orderConfirmation;

  public CheckOutPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(menu);
  }

  public CheckOutPage confirmOrderedItems() {
    proceedButton.click();
    return new CheckOutPage();
  }

  public CheckOutPage confirmAddress() {
    proceedButton2.click();
    return new CheckOutPage();
  }

  public CheckOutPage confirmShipping() {
    termsAndConditionCheckBox.click();
    proceedButton2.click();

    return new CheckOutPage();
  }

  public CheckOutPage confirmPaymentMethod() {
    payByBankWireButton.click();
    return new CheckOutPage();
  }

  public String confirmOrderFinal() {
    confirmMyOrderButton.click();
    System.out.println(orderConfirmation.getText());
    return orderConfirmation.getText();
  }
}
