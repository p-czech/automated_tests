package pages;


import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Actions;


public class HomePage {


  public HomePage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    Actions.waitForVisibilityOfElement(menu);
  }


  @FindBy(css = ".sf-menu")
  private WebElement menu;

  @FindBy(css = ".login")
  private WebElement signInButton;



  public SignInPage openSignInPage() {
      signInButton.click();
      return new SignInPage();
  }

  public void orderDress() {

  }


}
