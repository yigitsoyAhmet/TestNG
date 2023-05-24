package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLogin {

   @Test
    public void test01(){

       //qualitydemy anasayfaya gidin login linkine tıklayın

       Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
       QualitydemyPage qualitydemyPage=new QualitydemyPage();
       Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
       qualitydemyPage.cookies.click();
       qualitydemyPage.ilkLoginLinki.click();


       //gecerli username ve sifre girin
       qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
       qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

       // login butonuna basin
       qualitydemyPage.loginButonu.click();

       // basarili olarak giris yapildigini test edin
       Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());

       Driver.closeDriver();
   }
}
