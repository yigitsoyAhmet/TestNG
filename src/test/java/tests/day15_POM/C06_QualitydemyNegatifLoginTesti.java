package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLoginTesti {


    @Test
    public void test01() {

        //qualitydemy anasayfaya gidin login linkine tıklayın
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookies.click();
        qualitydemyPage.ilkLoginLinki.click();

        //gecerli username ve sifre girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        // login butonuna basin
        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        Driver.closeDriver();
    }
}
