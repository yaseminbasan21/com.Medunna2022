package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US014_page {
    public US014_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement singInButonu;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singInEnter;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesButonu;

    @FindBy(xpath = "//span[text()='My Inpatients']")
    public WebElement myInpatientsButonu;

    @FindBy(xpath = "//*[text()='In Patients']")
    public WebElement inPatientsBasligi;

    @FindBy(xpath = "//span[text()='ID']")
    public WebElement id;

    @FindBy(xpath = "//span[text()='Start Date']")
    public WebElement startDate;

    @FindBy(xpath = "//span[text()='End Date']")
    public WebElement enddate;

    @FindBy(xpath = "//span[text()='Status']")
    public WebElement status;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement description;

    @FindBy(xpath = "//span[text()='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement room;

    @FindBy(xpath = "//span[text()='Appointment']")
    public WebElement appointment;

    @FindBy(xpath ="//span[text()='Patient']" )
    public WebElement patient;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]"  ) // "(//span[text()='Edit'])[3]")
    public WebElement editButonu;

    @FindBy(xpath = "//span[text()='Create or edit a In Patient']")
    public WebElement createoreditbasligi;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateSekmesi;

    @FindBy(xpath = "//select[@id='in-patient-appointment']")
    public WebElement appointmentSekmesi;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusSekmesi;

    @FindBy(xpath = "//select[@name='room.id']")
    public WebElement roomSekmesi;

    @FindBy(xpath = "//select[@id='in-patient-patient']")
    public WebElement patientSekmesi;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createSayfasiSaveButonu;




}
