package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003_page {

    public US003_page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//div/ul/li[@id = 'account-menu']")
    public WebElement kullaniciSembol;

    @FindBy(xpath = "//div/ul//li[7]//span[text()='Register']")
    public WebElement registerButon;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement comfirmationPassword;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement enAzDortKarakterOlmaliYazisi;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 0, 0);']")
    public  WebElement passwordStrength1;

    @FindBy(xpath = "(//*[@style='background-color: rgb(255, 153, 0);'][2])")
    public  WebElement passwordStrength2;


    @FindBy(xpath = "(//*[@style='background-color: rgb(0, 255, 0);'])[3]")
    public WebElement passwordStrength3;


    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[4]")
    public  WebElement passwordStrength4;

    @FindBy(xpath = "(//*[@style='background-color: rgb(0, 255, 0);'])[5]")
    public  WebElement passwordStrength5;



}

