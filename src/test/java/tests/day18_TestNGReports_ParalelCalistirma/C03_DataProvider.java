package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {
    //DataProvider TestNG'nin test methodu disindan
    // teste data saglamak icin olusturdugu ozel bir yapidir.

    // Bu yapi iki katli bir array dondurur.
    @DataProvider
    public static Object[][] aranacaklarListesi() {

        String [][] aranacaklarArrayi={{"Java"}, {"Apple"}, {"Samsung"}, {"Faker"}, {"Cracker"}};

        return aranacaklarArrayi;
    }

    @Test(dataProvider = "aranacaklarListesi")
    public void test01(String aranacakKelime){

    // Amazon anasayfaya gidin
    Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    //Bize test methodu disindan List olarak verilen urunlerin hepsi icin arama kutusuna yazıp arama yapın
    AmazonPage amazonPage=new AmazonPage();
    amazonPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);


    //Sonuc yazisinin arattiginiz elementi icerdigini test edin
    String actualAramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
    String expectedIcerik=aranacakKelime;

    Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

    Driver.closeDriver();

   }
}
