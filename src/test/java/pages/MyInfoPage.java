package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilActions;
import utils.DataFaker;

public class MyInfoPage {

  public MyInfoPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(identity);
  }

  DataFaker faker = new DataFaker();


  @FindBy(id="identity")
  private  WebElement identity;

  @FindBy(id = "firstname")
  private WebElement firstNameInput;

  @FindBy(css = "button.btn:nth-child(1)")
  private WebElement saveChangesButton;

  @FindBy(id = "old_passwd")
  private WebElement password;

  @FindBy(css = ".account")
  private WebElement accountButton;

  @FindBy(css = ".account")
  private  WebElement myNameButton;


  public String changeName() {
    String oldName = firstNameInput.getAttribute("value");
    firstNameInput.clear();
    firstNameInput.sendKeys(faker.getFakeName());
    password.sendKeys("os52b87468e");
    saveChangesButton.click();
    return oldName;
  }

  public String getName() {
    String newName = firstNameInput.getAttribute("value");
    return newName;
  }
}
