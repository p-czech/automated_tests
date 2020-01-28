package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.DataFaker;

public class SignInPage extends BasePage {

  public SignInPage() {
    super();
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

  public HomePage logIn() {
    emailInputForLogIn.sendKeys("dennis.wunsch@gmail.com"); // valid email
    passwordInputForLogIn.sendKeys("os52b87468e"); // valid password
    logInButton.click();
    return new HomePage();
  }

}
