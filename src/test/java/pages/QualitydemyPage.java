package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

   public QualitydemyPage(){
       PageFactory.initElements(Driver.getDriver(),this);

   }

   @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

   @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

   @FindBy(xpath="//input[@name='password']")
    public WebElement passwordKutusu;

   @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButonu;

   @FindBy(xpath ="//a[text()='Instructor']")
   public WebElement basariliGirisKontrolElementi;

   @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookies;
}
