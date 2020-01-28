package tests;


import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;


public class ChangePersonalDetailsTest extends TestConfig {

  @Test
  public void testChangeFirstName() {
    String oldName = new HomePage()
            .openSignInPage()
            .logIn()
            .openMyAccountPage()
            .openMyPersonalInfoPage()
            .changeName();

    String newName = new HomePage()
            .openMyAccountPage()
            .openMyPersonalInfoPage()
            .getName();

    Assert.assertNotEquals(oldName, newName);

  }
}
