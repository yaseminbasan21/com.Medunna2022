package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US011_page {

    public US011_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement profil;

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement appointmentId;

    @FindBy(linkText = "SIGN IN AGAIN")
    public WebElement signInAgain;
    @FindBy(xpath = "//*[@id='hero']/div/h1")
    public WebElement homePage;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBox;
    @FindBy(xpath = "(//span)[10]")
    public WebElement contact;

    @FindBy(xpath = "//*[@id=\"hospitalmsappfrontendApp.appointment.home.createOrEditLabel\"]/span")
    public WebElement randevuDuzenleDyazısını;
    @FindBy(xpath = "//div[@class=\"container\"]//h1")
    public WebElement welcomeToMedunnaText;

    @FindBy(linkText = "MY PAGES")
    public WebElement giris;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement Sing_in;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SİNG_İN;
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement mypages;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppoınment;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement randevEdit;
    @FindBy(xpath = "//input[@name='id']")
    public WebElement id;
    @FindBy(xpath = "//*[@id=\"appointment-startDate\"]")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id='appointment-endDate']")
    public WebElement endTime;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement status;
    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement doktorBil;
    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnezBİL;
    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement tedaviBil;
    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement teshisBİL;
    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement receteBİL;
    @FindBy(xpath = "//*[@id='appointment-status']/option[2]")
    public WebElement pending;
    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement tanımBİL;
    @FindBy(xpath = "//*[@id='appointment-status']/option[3]")
    public WebElement comleted;
    @FindBy(xpath = "//*[@id='appointment-status']/option[4]")
    public WebElement cancelled;
    @FindBy (xpath = "//*[@name='status']")
    public WebElement statusDropDown;
    @FindBy (xpath = "//*[@id='save-entity']")
    //*[@id="save-entity"]/span
    public WebElement saveButonu;
    @FindBy (xpath = "//*[@name='status']")
    public WebElement statusDhropDown;
    @FindBy (xpath = "//*[@name='status']")
    public WebElement stathusDropDown;
    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement doktorRequestATestButton;
    @FindBy(xpath = "//input[@name='1402']")
    public WebElement testsUrea;

    @FindBy(xpath = "//input[@name='1403']")
    public WebElement testsCreatine;

    @FindBy(xpath = "//input[@name='1404']")
    public WebElement testsSodium;

    @FindBy(xpath = "//input[@name='1405']")
    public WebElement testsPotassium;

    @FindBy(xpath = "//input[@name='1406']")
    public WebElement testsTotalProtein;

    @FindBy(xpath = "//input[@name='1408']")
    public WebElement testsHemoglobin;

    @FindBy(xpath = "//input[@name='1407']")
    public WebElement testsAlbumin;

    @FindBy(xpath = "//input[@name='132791']")
    public WebElement testsGlucose;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement testsSaveButon;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/form/div[1]/div/table/thead/tr/th[2]/span")
    public WebElement testFindElement;//*[@id="app-view-container"]/div/div/div/form/div[1]/div/table/thead/tr/th[2]/span



}
