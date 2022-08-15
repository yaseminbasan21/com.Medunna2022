package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US002_page {

    public US002_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Your username is required.']")
    public WebElement userNameReqiredYazisi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[.='This field is invalid']")
    public WebElement emailInvalidYazisi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[.='Your email is required.']")
    public WebElement emailRequiredYazisi;

}
