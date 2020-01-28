package tests;


import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.MyInfoPage;


public class ChangePersonalDetailsTest extends TestConfig {

  @Test
  public void testChangeFirstName() {
    String oldName = new HomePage()
            .openSignInPage()
            .logIn()
            .openMyPersonalInfoPage()
            .changeName();

    String newName = new MyInfoPage()
            .openMyAccountPage()
            .openMyPersonalInfoPage()
            .getName();

    Assert.assertNotEquals(oldName, newName);

  }
}
