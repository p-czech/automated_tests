package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckOutPage extends BasePage{

  public CheckOutPage() {
    super();
  }

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
    return orderConfirmation.getText();
  }
}
