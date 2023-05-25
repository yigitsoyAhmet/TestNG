package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@aria-hidden='false']")
    public WebElement autoHomePage;
    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement rastgeleUrun;
    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement urunDetay;
    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement urunAdedi;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement addCartButonu;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;
    @FindBy (xpath = "//button[@class='disabled']")
    public WebElement urunAdediDogrumu;
    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement urunGorunme;
    @FindBy (xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement cartButton;
    @FindBy (xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement addCart;
    @FindBy (xpath = "//*[text()='Continue Shopping']")
    public WebElement conshoping;
    @FindBy (xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingPage;
    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "//u[text()='Register / Login']")
    public WebElement registerLogin;
    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement name;
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement signup;
    @FindBy (xpath = "(//div[@class='radio'])[1]")
    public WebElement radioButton;
}
