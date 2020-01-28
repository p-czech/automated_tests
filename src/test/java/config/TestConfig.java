package config;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;



public class TestConfig {

  private WebDriver driver;

  private String baseUrl = "http://automationpractice.com/index.php";

  @Before
  public void setUp() {
    driver = WebDriverSingleton.getInstance();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
