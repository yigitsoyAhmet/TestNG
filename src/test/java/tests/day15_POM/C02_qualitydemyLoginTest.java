package tests.day15_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest {

    @Test
    public void test01() throws InterruptedException {
        //qualitydemy anasayfaya gidin login linkine tıklayın
        Driver.getDriver().get("https://www.qualitydemy.com");

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        qualitydemyPage.ilkLoginLinki.click();




        //gecerli username ve sifre girin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");






        Thread.sleep(3);
        // login butonuna basin
        qualitydemyPage.loginButonu.click();
        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();




    }
}
