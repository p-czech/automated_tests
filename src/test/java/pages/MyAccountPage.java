package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UtilActions;


public class MyAccountPage extends BasePage  {

  public MyAccountPage(){
    super();
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
