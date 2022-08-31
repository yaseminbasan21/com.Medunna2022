package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US015_page {
    public US015_page(){
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

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsTitlesButonu;

    @FindBy(xpath = "//a[@href='/patient']")
    public WebElement patientButonu;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createANewPatientButonu;

    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='patient-lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='patient-phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement genderBox;

    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement bloodGroupBox;

    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//*[@id='patient-user']")
    public WebElement userBox;

    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement countryBox;

    @FindBy(xpath = "//*[@id='patient-cstate']")
    public WebElement stateCityBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[contains(text(),'A new Patient is created')]")
    public WebElement createdMesajı;

    @FindBy(xpath = "(//*[text()='Patients'])[1]")
    public WebElement patientsTitle;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement id;

    @FindBy(xpath = "//*[text()='SSN']")
    public WebElement ssn;

    @FindBy(xpath = "//*[text()='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[text()='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[text()='Birth Date']")
    public WebElement birthDate;

    @FindBy(xpath = "//*[text()='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement gender;

    @FindBy(xpath = "//*[text()='Blood Group']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//*[text()='Address']")
    public WebElement address;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement description;

    @FindBy(xpath = "//*[text()='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[text()='User']")
    public WebElement user;

    @FindBy(xpath = "(//*[text()='Country'])[2]")
    public WebElement country;

    @FindBy(xpath = "//*[text()=' State/City']")
    public WebElement stateCity;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement patientEdit;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public WebElement patientFirstName;

    @FindBy(xpath = "//input[@id='patient-lastName']")
    public WebElement patientLastname;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement patientBirthDate;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement patientEmail;

    @FindBy(xpath = "//input[@id='patient-phone']")
    public WebElement patientPhone;

    @FindBy(xpath = "//select[@id='patient-gender']")
    public WebElement patientGender;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement patientBloodGroup;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement patientAddress;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement patientDescripton;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement patientUser;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement patientCountry;

    @FindBy(xpath = "//select[@id='patient-cstate']")
    public WebElement patientStateCity;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButonu;

    @FindBy(xpath = "(//span[text()='Delete'])[21]")
    public WebElement onayKutDeleteButonu;

    @FindBy(xpath = "//div[text()='Internal server error.']")
    public WebElement hataMesajı;

    @FindBy(xpath = "//*[text()='Appointments']")
    public WebElement appointmentsTitle;

    @FindBy(xpath = "//span[text()='Appointment']")
    public WebElement appointmentButonu;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement appointmentEdit;

    @FindBy(xpath = "//select[@id='appointment-physician']")
    public WebElement physicianButonu;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement appointmentSaveButonu;
































}
