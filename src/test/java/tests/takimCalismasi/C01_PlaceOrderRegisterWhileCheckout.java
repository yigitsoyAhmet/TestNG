package tests.takimCalismasi;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class C01_PlaceOrderRegisterWhileCheckout {
    @Test
    public void test01(){
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        AutomationPage automationPage = new AutomationPage();
        // 3. Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationPage.autoHomePage.isDisplayed());
        // 4. Add products to cart
        Actions actions = new Actions(Driver.getDriver());
        automationPage.addCart.click();
        automationPage.conshoping.click();
        // 5. Click 'Cart' button
        automationPage.cartButton.click();
        // 6. Verify that cart page is displayed
        softAssert.assertTrue(automationPage.shoppingPage.isDisplayed());
        // 7. Click Proceed To Checkout
        automationPage.proceedToCheckout.click();
        // 8. Click 'Register / Login' button
        automationPage.registerLogin.click();
        // 9. Fill all details in Signup and create account
        Faker faker = new Faker();
        actions.click(automationPage.name)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).click().perform();

        // 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        // 11. Verify ' Logged in as username' at top
        // 12. Click 'Cart' button
        // 13. Click 'Proceed To Checkout' button
        // 14. Verify Address Details and Review Your Order
        // 15. Enter description in comment text area and click 'Place Order'
        // 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        // 17. Click 'Pay and Confirm Order' button
        // 18. Verify success message 'Your order has been placed successfully!'
        // 19. Click 'Delete Account' button
        // 20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        softAssert.assertAll();
    }
}
