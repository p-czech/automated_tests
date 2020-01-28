package pages;


import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import utils.UtilActions;



public class HomePage {

  Actions actions = new Actions(WebDriverSingleton.getInstance());

  public HomePage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(menu);

  }



  @FindBy(css = ".sf-menu")
  private WebElement menu;

  @FindBy(css = ".login")
  private WebElement signInButton;

  @FindBy(css = ".account")
  private WebElement myAccountButton;

  @FindBy(css =  ".sf-menu > li:nth-child(1) > a:nth-child(1)")
  private WebElement womenCategory;

  @FindBy(css = ".sf-menu > li:nth-child(1) > ul:nth-child(2)")
  private WebElement subMenu;

  @FindBy(css = ".sf-menu > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
  private WebElement tShirtsSubmenu;



  public SignInPage openSignInPage() {
      signInButton.click();
      return new SignInPage();
  }

  public MyAccountPage openMyAccountPage() {
    myAccountButton.click();
    return new MyAccountPage();

  }


  public TShirtsPage openTShirtPage()  {
    actions.moveToElement(womenCategory).click().perform();
    UtilActions.waitForVisibilityOfElement(tShirtsSubmenu);
    tShirtsSubmenu.click();
    return new TShirtsPage();

  }
}
