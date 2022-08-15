package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001_page {

    public US001_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisIkon;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement firstPasswordBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPassworddBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[.='Your SSN is invalid']")
    public WebElement ssnInvalidYazisi;

    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement ssnRequiredYazisi;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement firstNameRequiredYazisi;

    @FindBy(xpath = "//*[.='Your LastName is required.']")
    public WebElement lastNameRequiredYazisi;

    @FindBy(xpath = "//div[@class='form-group']")
    public WebElement DogrulukKontrol;

    @FindBy(xpath = "//*[.='This SSN has been registered for another user!']")
    public WebElement ssngirisDogrulamaYazisi;

    @FindBy(xpath = "//*[.='Registration Saved']")
    public WebElement girisDogrulamaYazisi;


}
