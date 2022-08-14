package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class US005_page {


    public US005_page()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC_01

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement mainpageMakeAnAppointmentButtonu;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement mainpageFirstnameTextBox;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement mainpageLastnameTextBox;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement mainpageSSNTextBox;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement mainpageEmailTextBox;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement mainpagePhoneTextBox;

    @FindBy (xpath = "//span[text()='Send an Appointment Request']")
    public WebElement mainpageSendAnAppointmentRequestButton;


    //TC_02


    @FindBy (xpath = "//li[@class='dropdown nav-item']")
    public WebElement profileIcon;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInElementi;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameTextbox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordTextbox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButtonu;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesButtonu;

    @FindBy (xpath = "//span[text()='My Appointments']")
    public WebElement loginPageMyAppointmentsButtonu;




}
