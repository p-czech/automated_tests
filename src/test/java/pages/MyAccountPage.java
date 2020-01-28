package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Actions;

public class MyAccountPage {

  public MyAccountPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    Actions.waitForVisibilityOfElement(myNameButton);
  }

  @FindBy(css = "div.col-sm-6:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")
  private WebElement myPersonalInfo;

  @FindBy(css = ".account")
  private  WebElement myNameButton;


  public MyInfoPage openMyPersonalInfoPage() {
    myPersonalInfo.click();
    return new MyInfoPage();
  }

}
