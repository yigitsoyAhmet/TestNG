package tests.takimCalismasi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_VerifyProductQuantityInCart {


    @Test
    public void test01() {
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        AutomationPage automationPage = new AutomationPage();
        // 3. Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationPage.autoHomePage.isDisplayed(), "Home page görünüyor");
        softAssert.assertAll();
        // 4. Click 'View Product' for any product on home page
        automationPage.rastgeleUrun.click();
        ReusableMethods.bekle(1);
        // 5. Verify product detail is opened
        softAssert.assertTrue(automationPage.urunDetay.isDisplayed());
        // 6. Increase quantity to 4
        automationPage.urunAdedi.clear();
        automationPage.urunAdedi.sendKeys("4");
        // 7. Click 'Add to cart' button
        automationPage.addCartButonu.click();
        // 8. Click 'View Cart' button
        automationPage.viewCartButton.click();
        // 9. Verify that product is displayed in cart page with exact quantity
        softAssert.assertTrue(automationPage.urunGorunme.isDisplayed());
        String ecpected = "4";
        String actualUrun = automationPage.urunAdediDogrumu.getText();
        softAssert.assertEquals(actualUrun, ecpected, "Urun 4 adet");
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
