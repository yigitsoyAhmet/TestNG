package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluSoftAssert extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Alert test",
                "Kullanici JS alertleri calıstırabilmeli ve kapatabilmeli");

        // 1. Test
        // -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        extentTest.info("Kullanici herokuapp alerts sayfasina gider");

        // - 1.alert'e tiklayin
        Thread.sleep(3000);
        WebElement ilkAlertElementi = Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkAlertElementi.click();
        extentTest.info("ilk alert butonuna click yapar");


        // -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        Thread.sleep(3000);

        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualAlertYazisi, expectedAlertYazisi);
        extentTest.info("softassert ile alert yazisiniz beklenen degere sahip oldugunu test eder");

        //-  OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("alert kapatılır");

        //allert'in kapatildiğini test edin

        softAssert.assertTrue(ilkAlertElementi.isEnabled(), "Allert kapatılamadı");
        extentTest.info("softassert ile alertin kapatildigini test eder");

        softAssert.assertAll();

        extentTest.pass("soft assert ile yapilan tüm testlerin sonucunu raporlar");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
