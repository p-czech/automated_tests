package pages;


import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Actions;
import utils.DataFaker;

public class SignInPage {


  public SignInPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    Actions.waitForVisibilityOfElement(createAccountButton);
  }

  DataFaker faker = new DataFaker();


  @FindBy(id = "email_create")
  private WebElement emailInput;

  @FindBy(css ="#SubmitCreate")
  private WebElement createAccountButton;

  @FindBy(id = "email")
  private WebElement emailInputForLogIn;

  @FindBy(id = "passwd")
  private WebElement passwordInputForLogIn;

  @FindBy(id = "SubmitLogin")
  private WebElement logInButton;

  public SignUpPage openSignUpPage() {
    emailInput.sendKeys(faker.getFakeEmail());
    createAccountButton.click();

    return new SignUpPage();
  }

  public MyAccountPage logIn() {
    emailInputForLogIn.sendKeys("dennis.wunsch@gmail.com"); // valid email
    passwordInputForLogIn.sendKeys("os52b87468e"); // valid password
    logInButton.click();
    return new MyAccountPage();
  }

}
