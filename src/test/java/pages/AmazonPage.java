package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        //bu ayari cons koyma nedenimiz page sayfalarına obje olusturularak ulasıldığı için
        // kim page sayfasını kullanmak isterse page sayfasından obje olustururken cons calısacak ve cons içinde bulunan
        //initElemnts()methodu gerekli ayarlamaları yapacak
    }

    @FindBy(id="twotabsearchtextbox")
  public   WebElement aramaKutusu;

    @FindBy(xpath ="(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;
}
