package tests.day19_crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseCross;

public class C01_AmazonSearch extends TestBaseCross {

    @Test
    public void test01(){

        driver.get("https://www.amazon.com");

        //nutella için arama yapalım
        //locate pages sayfasında POM'de pages sayfasındaki locatelere erişmek
        // için pages sayfalarından bir obje olusturulur

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //sonuclar Nutella içeriyor mu test et
        String expectedIcerik="Nutella";
        WebElement aramaSonucuElementi= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String actualAramaSonucYazisi=aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

    }
}
