package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Actions;
import utils.DataFaker;

public class SignUpPage {

  public SignUpPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    Actions.waitForVisibilityOfElement(registerAccountButton);
  }

  DataFaker faker = new DataFaker();
  //personal information

  @FindBy(id = "id_gender1")
  private WebElement radioSelectionMr;

  @FindBy(id = "id_gender2")
  private WebElement radioSelectionMrs;

  @FindBy(id = "customer_firstname")
  private WebElement firstNameInput;

  @FindBy(id="customer_lastname")
  private WebElement lastNameInput;

  @FindBy(id = "passwd")
  private WebElement passwordInput;

  @FindBy(id = "days")
  private WebElement daysInput;

  @FindBy(id = "months")
  private WebElement monthsInput;

  @FindBy(id = "years")
  private WebElement yearsInput;

  //address
  @FindBy(id = "firstname")
  private WebElement firstNameAddressInput;

  @FindBy(id = "lastname")
  private WebElement lastNameAddressInput;

  @FindBy(id = "address1")
  private WebElement addressLineInput;

  @FindBy(id = "city")
  private WebElement cityAddressInput;

  @FindBy(id = "id_state")
  private WebElement stateSelect;

  @FindBy(id = "postcode")
  private WebElement postCodeInput;

  @FindBy(id = "id_country")
  private WebElement countrySelect;

  @FindBy(id = "phone_mobile")
  private WebElement phoneNumberInput;

  @FindBy(id = "alias")
  private WebElement addressAliasInput;

  @FindBy(id = "submitAccount")
  private WebElement registerAccountButton;


  public void fillInTheRegistrationForm() {
    radioSelectionMr.click();
    firstNameInput.sendKeys(faker.getFakeName());
    lastNameInput.sendKeys(faker.getFakeSurname());
    passwordInput.sendKeys(faker.getFakePassword());
    new Select(daysInput).selectByValue("14"); //to be fixed in DataFaker
    new Select(monthsInput).selectByValue("2"); //to be fixed in DataFaker
    new Select(yearsInput).selectByValue("1999"); //to be fixed in DataFaker
    firstNameAddressInput.sendKeys(faker.getFakeName());
    lastNameAddressInput.sendKeys(faker.getFakeSurname());
    addressLineInput.sendKeys(faker.getFakeAddress());
    cityAddressInput.sendKeys(faker.getFakeCity());
    stateSelect.sendKeys("New York"); //to be fixed in DataFaker
    postCodeInput.sendKeys("55684"); //to be fixed to return random 5-digit
    phoneNumberInput.sendKeys(faker.getFakeMobileNumber());
  }


  public MyAccountPage submitFormWithValidData() {
    fillInTheRegistrationForm();
    registerAccountButton.click();
    return new MyAccountPage();
  }

}
