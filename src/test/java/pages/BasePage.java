package pages;


import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilActions;

public class BasePage {

  public BasePage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(menu);
  }

  @FindBy(css = ".sf-menu")
  private WebElement menu;

}
