package tests.day16_POM_Assertions;

import org.testng.annotations.Test;
import utilities.Driver;

public class C02_SigletonPattern {
    @Test
    public void test01(){
        // otomasyon için elimiz ve kolumuz olarak Driver classındaki WebDriver  driver objesini kullanıyoruz
        // ancak driverin bizim istediğimiz işlemleri yapabilmesi için oncelikle getdriver methodu içinde
        // yaptıgımız atama işlemlerine ihtiyacı var, framework da çalısan kisiler getDriver methodunu kullanmadan
        //direk driver objesine erişimini engellemek için SingletonPattern kullanılır.
        //SingletonPattern bir classdan obje olusturulmasını ve o obje ile class uyelerine erişimi
        // engellemek için kullanılır.
        //Driver.driver.get(); getDriver calısmadığı için null pointer exception verir.



    }
}
