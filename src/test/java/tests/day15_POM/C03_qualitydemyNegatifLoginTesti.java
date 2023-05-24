package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_qualitydemyNegatifLoginTesti {


    @Test
    public void gecersizIsimSifreTesti() {

        //qualitydemy anasayfaya gidin ilk login linkine tıklayın
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.cookies.click();

        //kullanıcı adı olarak "selenium"
        qualitydemyPage.emailKutusu.sendKeys("selenium");
        qualitydemyPage.cookies.click();

        //password olarak heyecandir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");
        ReusableMethods.bekle(2);


        //logine tıklayın

        qualitydemyPage.loginButonu.click();

        //giriş yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
