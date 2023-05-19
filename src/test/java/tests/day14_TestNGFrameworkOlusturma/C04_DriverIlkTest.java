package tests.day14_TestNGFrameworkOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class C04_DriverIlkTest {
    /*
    POM'de driver olusturmak icin extends(inheritance) ile kullandıgımız TestBase classı yerine
    static yollarla ulasabilecegımız bir method kullanılması tercih edilmiştir.
    driver bizim icin onemlı oldugundan driver icin bagımsız bir class olusturacagız.

    */
    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucElementi=Driver.getDriver().findElement(By.xpath("( //div[@class='sg-col-inner'])[1]"));
        String expectedIcerik="Nutella";
        String actualSonucYazisi=sonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }
}
