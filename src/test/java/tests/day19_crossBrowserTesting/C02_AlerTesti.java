package tests.day19_crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseCross;

public class C02_AlerTesti extends TestBaseCross {

    @Test
    public void test01() throws InterruptedException {


        // 1. Test
        // -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // - 1.alert'e tiklayin

        WebElement ilkAlertElementi = driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkAlertElementi.click();


        // -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin

        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = driver.switchTo().alert().getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualAlertYazisi, expectedAlertYazisi);

        //-  OK tusuna basip alert'i kapatin
        driver.switchTo().alert().accept();


        //allert'in kapatildiğini test edin

        softAssert.assertTrue(ilkAlertElementi.isEnabled(), "Allert kapatılamadı");

        softAssert.assertAll();


    }
}
