package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US013_page {
    public US013_page() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointmentsButonu;

    @FindBy(xpath ="(//span[text()='Edit'])[2]") //"//a[@href='/appointment-update/159698']")
    public WebElement editButonu;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultsButonu;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewButonu;

    @FindBy(xpath = "//div//th[1]")
    public WebElement idBaslik;

    @FindBy(xpath = "//div//th[2]")
    public WebElement nameBaslik;

    @FindBy(xpath = "//div//th[4]")
    public WebElement defultMinValue;

    @FindBy(xpath = "//div//th[5]")
    public WebElement defultMaxValue;

    @FindBy(xpath = "//div//th[6]")
    public WebElement testBaslik;

    @FindBy(xpath = "//div//th[8]")
    public WebElement dateBaslik;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anemnesisSekmesi;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmentSekmesi;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosisSekmesi;

    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescriptionSekmesi;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionSekmesi;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//button[@class='btn btn-warning btn-sm']")
    public WebElement requestImpatientButonu;

    @FindBy(xpath = "//div[text()='InPatient request already done for this appointment']")
    public WebElement inpatientMessage;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestTestButton;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

}
