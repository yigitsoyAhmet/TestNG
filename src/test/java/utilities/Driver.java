package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){


       if (driver==null){
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();//her seferinde yeniden chrome driver atamasını onledik.
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       }
        return driver;
    }
    public static void closeDriver(){

        driver.close();
    }
}
