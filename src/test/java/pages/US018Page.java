package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US018Page {
    public US018Page(){        PageFactory.initElements(Driver.getDriver(),this);    }
    @FindBy(xpath = "//*[@id='account-menu']")    public WebElement kullaniciLogo;
    @FindBy(xpath = "//*[@id='login-item']")    public WebElement firstSignInButton;
    @FindBy(xpath = "//input[@name='username']")    public WebElement usernameButton;
    @FindBy(xpath = "//input[@name='password']")    public WebElement passwordButton;
    @FindBy(xpath = "//button[@type='submit']")    public WebElement secondSignInButton;
    @FindBy(xpath = "//*[text()='Administration']")    public WebElement administration;
    @FindBy(xpath = "//*[text()='User management']")    public WebElement userManagement;
    @FindBy(xpath = "//*[text()='Items&Titles']")    public WebElement itemsAndTitles;
    @FindBy(xpath = "(//*[text()='Physician'])[1]")    public WebElement physician;
    @FindBy(xpath = "//*[text()='Create a new Physician']")    public WebElement createANewPhysician;
    @FindBy(xpath = "//*[text()='Create a new user']")    public WebElement createANewUser;
    @FindBy(xpath = "//input[@name='login']")    public WebElement loginTextBox;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@name='lastName']")    public WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@name='email']")    public WebElement emailTextBox;
    @FindBy(xpath = "//input[@name='ssn']")    public WebElement ssnTextBox;
    @FindBy(xpath = "//select[@id='authorities']")    public WebElement roleDdm;
    @FindBy(xpath = "//*[text()='3']")    public WebElement ucuncuSayfaButton;
    @FindBy(xpath = "//*[text()='Internal server error.']")    public WebElement internalServerErrorMesaji;
    @FindBy(xpath = "//*[text()='User found with search SSN']")    public WebElement dogrulamaMesaji;
    @FindBy(xpath = "//*[text()='A new Physician is created with identifier 202913']")    public WebElement dogrulamaMesaji2;
    @FindBy(xpath = "//*[.='A Physician is updated with identifier 10511']")    public WebElement dogrulamaMesaji3;
    @FindBy(xpath = "//*[text()='A Physician is deleted with identifier 10511']")    public WebElement dogrulamaMesaji4;
    @FindBy(xpath = "//*[text()='A Physician is updated with identifier 10501']")    public WebElement dogrulamaMesaji5;
    @FindBy(xpath = "//*[text()='Save']")    public WebElement saveButton;
    @FindBy(xpath = "(//*[text()='Medunna'])[1]")    public WebElement medunnaText;
    @FindBy(xpath = "//*[text()='Search User']")    public WebElement searchUser;
    @FindBy(xpath = "//input[@id='searchSSN']")    public WebElement searchSSN;
    @FindBy(xpath = "//input[@id='useSSNSearch']")    public WebElement useSSNSearchCheckBox;
    @FindBy(xpath = "//thead//tr")    public List<WebElement> doctorInfo;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']")    public WebElement lastName;
    @FindBy(xpath = "//input[@name='birthDate']")    public WebElement birthDate;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement phone;
    @FindBy(xpath = "//input[@name='adress']")    public WebElement adress;
    @FindBy(xpath = "//select[@id='physician-gender']")    public WebElement genderDdm;
    @FindBy(xpath = "//select[@id='physician-speciality']")    public WebElement specialityDdm;
    @FindBy(xpath = "//select[@id='physician-bloodGroup']")    public WebElement bloodGroupDdm;
    @FindBy(xpath = "//input[@id='physician-description']")    public WebElement description;
    @FindBy(xpath = "//input[@id='physician-examFee']")    public WebElement examFee;
    @FindBy(xpath = "//select[@id='physician-country']")    public WebElement countryDdm;
    @FindBy(xpath = "//select[@name='user.id']")    public WebElement userButton;
    @FindBy(xpath = "//input[@id='file_image']")    public WebElement dosyaSecButton;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[5]")    public WebElement editButton;
    @FindBy(xpath = "(//*[.='21'])[1]")    public WebElement physicianSayfa21;
    @FindBy(xpath = "(//*[.='22'])[1]")    public WebElement physicianSayfa22;
    @FindBy(xpath = "(//*[.='23'])[1]")    public WebElement physicianSayfa23;
    @FindBy(xpath = "(//*[.='24'])[1]")    public WebElement physicianSayfa24;
    @FindBy(xpath = "//*[.='214529']")    public WebElement firstnameId;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[15]")    public WebElement physicianEditButton;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")    public WebElement deleteButton;
    @FindBy(xpath = "//button[@id='jhi-confirm-delete-physician']")    public WebElement deleteButton2;
    @FindBy(xpath = "//tbody/tr[1]/td")    public List<WebElement> table;
    @FindBy(xpath = "//td[1]")    public List<WebElement> idTableList;
    @FindBy(xpath = "//td[3]")    public List<WebElement> firstnameTableList;
    @FindBy(xpath = "//td[2]")    public List<WebElement> loginTableList;
    @FindBy(xpath = "//div[@class='info jhi-item-count']")    public  WebElement countOfPhysicians;
}
