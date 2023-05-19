package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PageIlkTest {
    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        //nutella için arama yapalım
        //locate pages sayfasında POM'de pages sayfasındaki locatelere erişmek
        // için pages sayfalarından bir obje olusturulur

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //sonuclar Nutella içeriyor mu test et
        String expectedIcerik="Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();



    }
}
