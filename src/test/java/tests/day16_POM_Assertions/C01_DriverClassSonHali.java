package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    @Test
    public void amazonTest(){
    //amazona gidip url in amazon içerdiğini test edin
        //her methodda yeni driver olusturup sonunda driveri kapatın
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void wiseTest(){
        //Wisequartera anasayfaya gidip titlein wisequarter içerdiğini test edin

        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik="Wise Quarter";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void facebookTest(){
        //facebooka gidip title in amazon içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik="Facebook";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }
}
