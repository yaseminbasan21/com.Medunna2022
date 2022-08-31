package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US021_page1 {

    public US021_page1(){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath="//button[@type='submit']")
    public WebElement signin2;

    @FindBy(xpath="(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement showAppointment;

    @FindBy(xpath="(//span[@class='d-none d-md-inline'])[1]")
    public WebElement editShowTest;

    @FindBy(xpath="(//span['Create or Edit an Appointment'])[18])")
    public WebElement createorEditAppointment;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement status;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath="(//span['Save'])[31]")
    public WebElement save;

    @FindBy(xpath="//select[@name='physician.id']")
    public WebElement doktorSec;

    @FindBy(xpath = "//*[@id='account-menu']") public WebElement accountMenu;
    @FindBy(id = "login-item") public WebElement signIn; //SignIn sayfasini acma butonu
    @FindBy(id = "username") public WebElement usernameTextbox;
    @FindBy(id = "password") public WebElement passwordTextbox;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]") public WebElement signInButton; //SignIn sayfasindaki signin buttonu
    @FindBy(xpath = "//a[@href='/account/register']") public WebElement register; //us001
    @FindBy(xpath = "//span[text()='User Me']") public WebElement usernamelogin; //
    @FindBy(xpath = "//input[@id='rememberMe']") public WebElement rememberMe;

    @FindBy(xpath = "//span[text()='MY PAGES']")public WebElement staffMyPage;
    @FindBy(xpath = "//span[text()='Search Patient']")public WebElement searchPatient;
    @FindBy(xpath = "//span[text()='In Patient']")public WebElement staffInPatient;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement Register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public WebElement SSNHataMesaji;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;

    @FindBy (xpath="(//div[@class='justify-content-center row'])[2]")
    public WebElement bosAlan;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement firstNameHataMesaji;

    @FindBy(xpath="//*[text()='Your LastName is required.']")
    public WebElement lastNameHataMesasji;
    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public List<WebElement> YourSSNisinvalidmesaji;

    @FindBy(xpath = "//input[@id=\"username\"]")
    public WebElement usernamebox;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsRequiredMesaji;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourEmailIsRequiredMesaji;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourEmailIsRequiredMessage;

    @FindBy(xpath = "//input[@name=\"firstPassword\"]")
    public WebElement passwordbox;
//input[@name="firstPassword"]

    //    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    //  public WebElement YourFirstNameIsrequiredMesaji;
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement anasayfaInsanIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anasayfaInsanIkonuSignInElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButonu;

    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    public WebElement YourFirstNameIsrequiredMesaji;

    @FindBy(xpath = "//div[text()='Registration Saved']") public WebElement registrationSavedPopup;



}
