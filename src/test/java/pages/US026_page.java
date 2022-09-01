package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US026_page {
    public US026_page(){
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

    @FindBy(xpath = "//*[text()='CONTACT']")
    public WebElement contButonu;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement contNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement contEmailbox;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement contSubjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contMessageBox;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement contSendButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement receivedYazısı;


}


