package tests;


import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class OrderTest extends TestConfig {

  @Test
  public void orderOneItem() {

    String orderMessage = new HomePage()
            .openSignInPage()
            .logIn()
            .openTShirtPage()
            .openProductPage()
            .orderOneSmallBlueTShirt()
            .confirmOrderedItems()
            .confirmAddress()
            .confirmShipping()
            .confirmPaymentMethod()
            .confirmOrderFinal();

    Assert.assertEquals("Your order on My Store is complete.", orderMessage);
  }

}
