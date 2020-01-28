package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {

    private static WebDriver driver;
    private WebDriverSingleton() {};

    public static WebDriver getInstance() {
      if (driver == null) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

      }
      return driver;
    }
}
