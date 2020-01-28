package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DataFaker;


public class TShirtsPage extends BasePage {

  DataFaker faker= new DataFaker();

  public TShirtsPage() {
    super();
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
