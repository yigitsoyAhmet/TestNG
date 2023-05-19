package tests.day14_TestNGFrameworkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    //dependsonmethods oncelik sırasına karısmaz bu method bir test methodunun çalısmasını
    // baska bir methodun calısıp passed olmasına baglar baglanılan method calısmaz  veya
     //calısır failed olursa baglanan method hiç calısmaz

    // @Test notasyonu sayesinde her test bagımsız olarak calıstırılabilir
    // ancak bir test dependsonmethod ile baska bir methoda baglanmıs ise
    // tek basına calıstırılması istendiğinde once baglı oldugu methodu calısır
    // o method calısıp passed olursa asıl calısacak test methodu da calısır.
    //bu baglantı 3 veya daha fazla method arasında olursa calıstırmak istediğimiz baska methoda
    // o da baska bir methoda bağlıysa 3'u birden calısmaz

    @Test(dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");

    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir
        System.out.println("Amazon");
    }
}
