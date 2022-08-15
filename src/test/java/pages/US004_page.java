package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US004_page {

    public US004_page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//div/ul/li[@id = 'account-menu']")
    public WebElement kullaniciSembol;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement singInButton1;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@placeholder='Your password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='rememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@value='true']")
    public WebElement rememberCheckBox;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement sifremiUnuttum;

    @FindBy(xpath = "(//div/a[@href='/account/register'])[2]")
    public WebElement newAccount;

    @FindBy(xpath = "(//div/button[@type='button'])[2]")
    public WebElement cancel;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement singOut;


}
