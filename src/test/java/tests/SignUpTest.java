package tests;


import config.TestConfig;
import config.WebDriverSingleton;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class SignUpTest extends TestConfig {

  @Test
  public void testSignUp() {
    new HomePage()
            .openSignInPage()
            .openSignUpPage()
            .submitFormWithValidData();
    Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", WebDriverSingleton.getInstance().getCurrentUrl());
  }

}
