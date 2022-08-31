package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US020_page {

    public US020_page(){


        PageFactory.initElements(Driver.getDriver(), this);    }

    //LoginPage

    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement signInLocation;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username205;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password205;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton205;

    @FindBy(id="account-menu")
    public WebElement signInAndRegistrationPortal;

    @FindBy(id="login-item")
    public WebElement signIn;


    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement signedInUserName;

    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//a[@class='dropdown-item'][3]")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[text()='Team83-kubraoz']")
    public WebElement shownUserName;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failedToSignInAlert;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[3]/a/span")
    public WebElement didYouForgetPasswd;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[4]/a")
    public WebElement registerNewAccount;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancelButton;


    //US 20 PAGE

    @FindBy(xpath = "//*[@id='admin-menu']/a/span")
    public WebElement administration;

    @FindBy(xpath = "//*[@id='admin-menu']/div/a/span")
    public WebElement userManagement;

    @FindBy(xpath = "//*[@id='admin-menu']/div/ul/li[1]/a/span")
    public WebElement users;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[1])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[2])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[3])[1]")
    public WebElement deleteButton;

    @FindBy(xpath ="//div[@class='modal-footer']/button[2]")
    public WebElement deleteConfirmButton;

    @FindBy(xpath ="//*[contains(text(), 'A user is deleted')]")
    public WebElement userDeletedMessage;

    @FindBy(xpath = "//*[text()='First name']")
    public WebElement firstNameText;

    @FindBy(xpath = "//*[text()='Last name']")
    public WebElement lastNameText;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@id='activated']")
    public WebElement activatedCheckbox;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profileDropdown;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successMessage;


    // registerpage

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement ssnErrorMessage;

    @FindBy(xpath="//*[text()='Your SSN is invalid']")
    public WebElement ssnInvalidErrorMessage;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement lastNameErrorMessage;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Registration Saved')]")
    public WebElement registrationSuccessMessage;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 0, 0);']")
    public static WebElement passwordStrength1;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[2]")
    public static WebElement passwordStrength2;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[3]")
    public static WebElement passwordStrength3;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[4]")
    public static WebElement passwordStrength4;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[5]")
    public static WebElement passwordStrength5;

    @FindBy(xpath = "//*[@style='background-color: rgb(221, 221, 221);']")
    public static WebElement fifthPasswordBarGray;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public static WebElement passwordErrorMessage;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public static WebElement newPasswordBoxStatic;

    //homepage

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement userIcon;
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton1;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsAndTitlesButton;
    @FindBy(xpath = "//a[@href='/patient']")
    public WebElement patientButton;





}
