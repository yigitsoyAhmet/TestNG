package tests.takimCalismasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_calisma {

    @Test
    public void test01() throws InterruptedException {
        // 1. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        // 2. Verify that home page is visible successfully
        WebElement homePageHtmlElementi = Driver.getDriver().findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePageHtmlElementi.isDisplayed());
        // 3. Click on 'Contact Us' button
        Driver.getDriver().findElement(By.xpath("//*[@href='/contact_us']")).click();
        // 4. Verify 'GET IN TOUCH' is visible
        WebElement getInTouchElementi = Driver.getDriver().findElement(By.xpath("//h2"));
        Assert.assertTrue(getInTouchElementi.isDisplayed());
        // 5. Enter name, email, subject and message
        WebElement nameElementi = Driver.getDriver().findElement(By.xpath("//*[@data-qa='name']"));
        nameElementi.sendKeys("derya");
        WebElement emailElementi = Driver.getDriver().findElement(By.xpath("//*[@data-qa='email']"));
        emailElementi.sendKeys("derdrs11@gmail.com");
        WebElement subjectElementi = Driver.getDriver().findElement(By.xpath("//*[@data-qa='subject']"));
        subjectElementi.sendKeys("ornek");
        WebElement messageElementi = Driver.getDriver().findElement(By.xpath("//*[@data-qa='message']"));
        messageElementi.sendKeys("selenium heyecandir");
        // 6. Upload file
        WebElement dosyaSecElementi = Driver.getDriver().findElement(By.xpath("//*[@name='upload_file']"));
        String herkesteFarkliOlanKisim = System.getProperty("user.dir");
        String herkesteAyniOlanKisim = "/src/test/java/day10_actionsClass_Faker_FileTestleri/deneme.txt";
        String dosyaYolu = herkesteFarkliOlanKisim + herkesteAyniOlanKisim;
        dosyaSecElementi.sendKeys(dosyaYolu);
        Thread.sleep(3000);
        // 7. Click 'Submit' button
        Driver.getDriver().findElement(By.xpath("//*[@name='submit']")).click();
        // 8. Click OK button
        Driver.getDriver().switchTo().alert().accept();
        // 9. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement successElementi = Driver.getDriver().findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(successElementi.isDisplayed());
        // 10. Click 'Home' button and verify that landed to home page successfully
        Driver.getDriver().findElement(By.xpath("(//a[@href='/'])[1]")).click();
        WebElement homePageElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='carousel-inner'])[1]"));
        Assert.assertTrue(homePageElementi.isDisplayed());
    }
}