package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US007_page {
    public US007_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInIkon;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInOk;

    @FindBy(id="account-menu")
    public WebElement kullaniciIsimDog;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;

    @FindBy(xpath = "//span[normalize-space()='Make an Appointment']")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//h2[normalize-space()='Make an Appointment']")
    public WebElement makeAnAppointmentText;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement dateBox;

    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequestButon;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement dogrulamaText;

    @FindBy(xpath = "//span[normalize-space()='Appointment date can not be past date!']")
    public WebElement pastDateText;
}
