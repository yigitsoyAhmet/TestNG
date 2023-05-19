package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {


    @Test
    public void test01() {

        //qualitydemy anasayfaya gidin ilk login linkine tıklayın
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        //kullanıcı adı olarak "selenium"
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        //password olarak heyecandir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");
        //logine tıklayın
        qualitydemyPage.loginButonu.click();

        //giriş yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
