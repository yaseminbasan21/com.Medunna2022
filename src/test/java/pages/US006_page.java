package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US006_page {

    public US006_page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisHesapButonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement girisSignInButonu;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement HesapButonu;

    @FindBy(xpath = "//a[@class='dropdown-item'][1]")
    public WebElement settingsButonu;

    @FindBy(xpath = "//h2[@id='settings-title']")
    public WebElement userSettingsFor;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement settingsSaved;

    @FindBy(xpath ="//div[text()='Your first name is required.']")
    public WebElement firstnameRequired;

    @FindBy(xpath ="//div[text()='Your last name is required.']" )
    public WebElement lastnameRequired;

    @FindBy(xpath ="//div[text()='Your email is required.']" )
    public WebElement emailRequired;

}
