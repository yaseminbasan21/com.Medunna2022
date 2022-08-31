package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US008_page {
    public US008_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement giris;

    @FindBy(xpath = "//a[@class=\"dropdown-item\"]")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameKutusu;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement signInButon;

    @FindBy(xpath = "//span[normalize-space()='team55 team55']")
    public WebElement admin;

    @FindBy(xpath = "//span[normalize-space()='huseyin ercik']")
    public WebElement doktor;

    @FindBy(xpath = "//span[normalize-space()='stafteam55 stafteam55']")
    public WebElement personel;

    @FindBy(xpath = "//span[normalize-space()='Hasta Team55 Hasta Team55']")
    public WebElement hasta;

    @FindBy(xpath = "//a[@href=\"/account/password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@name=\"currentPassword\"]")
    public WebElement currentPasswordKutusu;

    @FindBy(xpath = "//input[@name=\"newPassword\"]")
    public WebElement newPasswordKutusu;

    @FindBy(xpath = "//input[@id=\"confirmPassword\"]")
    public WebElement confirmPasswordKutusu;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement saveButonu;

    @FindBy(xpath = "//strong[normalize-space()='Password changed!']")
    public WebElement basariMesaji;

    @FindBy(xpath = "//span[normalize-space()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "(//li[@class=\"point\"])[1]")
    public WebElement birinciLamba;

    @FindBy(xpath = "(//li[@class=\"point\"])[2]")
    public WebElement ikinciLamba;

    @FindBy(xpath = "(//li[@class=\"point\"])[4]")
    public WebElement donduncuLamba;

    @FindBy(xpath = "(//li[@class=\"point\"])[5]")
    public WebElement besinciLamba;
}
