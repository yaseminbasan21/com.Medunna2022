package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class US022_page {

    public US022_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement sginInButton;

    @FindBy(name = "username")
    public WebElement usernametetxt;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPageButton;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searhPatientButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnSearchTextBox;

    @FindBy(xpath = "//td[.='567-89-4322']")
    public WebElement aranankullaniciSSN;

    @FindBy(xpath = "//*[.='Show Appointments']")
    public WebElement show22Appo;

    @FindBy(xpath = "//a[@href=\"/tests/appointment/209125\"]")
    public WebElement show22Test;

    @FindBy(xpath = "//span[text()='Tests']")
    public WebElement testsTitle;

    @FindBy(xpath = "//a[text()='209125']")
    public WebElement arananAppoNum;

    @FindBy(xpath = "//span[text()='View Results']")
    public WebElement viewResult;

    @FindBy(xpath = "//a[text()='207990']")
    public WebElement testID;

    @FindBy(xpath = "//a[@href=\"/patient-update/209210\"]")
    public WebElement edit22button;

    @FindBy(name = "id")
    public WebElement id22TxtBox;

    @FindBy(name = "firstName")
    public WebElement firstName22TxtBox;

    @FindBy(name = "lastName")
    public WebElement lastName22TxtBox;

    @FindBy(name = "birthDate")
    public WebElement birthDate22TxtBox;

    @FindBy(name = "email")
    public WebElement email22TxtBox;

    @FindBy(name = "phone")
    public WebElement phone22TxtBox;

    @FindBy(name = "gender")
    public WebElement gender22TxtBox;

    @FindBy(name = "bloodGroup")
    public WebElement bloodGroup22TxtBox;

    @FindBy(name = "adress")
    public WebElement adress22TxtBox;

    @FindBy(xpath = "//meta[@name='description']")
    public WebElement description22TxtBox;

    @FindBy(name = "user.id")
    public WebElement userName22TxtBox;

    @FindBy(name = "country.id")
    public WebElement country22TxtBox;

    @FindBy(name = "cstate.id")
    public WebElement cstate22TxtBox;

    @FindBy(xpath = "//*[@value='209210']")
    public WebElement id22;

    @FindBy(xpath = "//*[@value='Hasta']")
    public WebElement firstName22Hasta;

    @FindBy(xpath = "//*[@value='Hakki']")
    public WebElement lastName22Hakki;

    @FindBy(xpath = "//*[@value='hastahakkki@med.unna']")
    public WebElement email22;

    @FindBy(xpath = "//*[@value='333-333-4440']")
    public WebElement phone22;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='A Patient is updated with identifier 209210']")
    public WebElement basariAlert;

    @FindBy(xpath = "//*[@value='degismishasta']")
    public WebElement degismisFirstName;

    @FindBy(xpath = "//*[@value='degismisHakki']")
    public WebElement degismisLastName;

    @FindBy(xpath = "//*[@value='degismis@email.com']")
    public WebElement degismisEamil;

    @FindBy(xpath = "//*[@value='444-333-2222']")
    public WebElement degismisPhone;

    @FindBy(xpath = "//span[text()='Back']")
    public WebElement backButton;

}
