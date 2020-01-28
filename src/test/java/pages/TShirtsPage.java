package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.DataFaker;
import utils.UtilActions;

import java.util.Random;

public class TShirtsPage {

  DataFaker faker= new DataFaker();

  public TShirtsPage() {
    PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    UtilActions.waitForVisibilityOfElement(menu);
  }

  @FindBy(css = ".sf-menu")
  private WebElement menu;

  @FindBy(css = ".product_img_link > img:nth-child(1)")
  private WebElement photo;



  public ProductPage openProductPage() {
    photo.click();
    return new ProductPage();
  }



}
