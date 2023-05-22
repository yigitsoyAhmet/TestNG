package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void hardAssertion() {
        //Assert islemi ilk failed oldugunda selenium calısmayı durdurur ve AssertionError verir.
        //eger bir test methodu içinde birden fazla assertion varsa ilk failed olanda calısma durur
        //sonraki assertion'lar calısmaz, TestNG bu konuda bize yetki vererek istersek TestNG assertion
        // failed olsa bile biz bizim istediğimiz satıra kadar kodların devam etmesini saglayabiliriz
        //artık rapor ver dediğimizde failed olan tum assertionları raporlar ve failed olan varsa calısmayı durdurur


        int sayi = 36;

        Assert.assertTrue(sayi % 2 == 0,"sayi cift olmali");//sayi cift mi
        Assert.assertTrue(sayi > 100);
        Assert.assertTrue(sayi<1000);
        Assert.assertFalse(sayi%3==0);//3 ile bolunemediğini test
    }

    @Test
    public void softAssertiontesti(){
        /*
        softAssert classı sayesinde assertAll methodunun calısacagı satıra kadar tum assertionlar
         failed olan olsa bile calısmaya devam eder. assertAll calıstıgında failed olan assertionlara
          ait rapru verir ama hangi satırda oldugunu vermez. assertAll un oldugu satırı hatalı gosterir
          failed i bulabilmek için
         */
        int sayi = 36;
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(sayi % 2 == 0,"sayi cift olmali");//sayi cift mi
        softAssert.assertTrue(sayi > 100,"sayi 100'den buyuk olmalı");
        softAssert.assertTrue(sayi<1000,"sayi 1000'den kucuk olmali");
        softAssert.assertFalse(sayi%3==0,"sayi 3'e bolunememeli");//3 ile bolunemediğini test

        softAssert.assertAll();//bunu demezsek test direk passed olur,failed olanlarda raporlama olmaz

    }
}
