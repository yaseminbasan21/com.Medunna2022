package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//*[@id='login-item']/span")
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
    @FindBy(xpath = "//*[@name='status']")
    public WebElement statusDropDown;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement ransaveButonu;
    @FindBy(xpath = "//*[@name='status']")
    public WebElement statusDhropDown;
    @FindBy(xpath = "//*[@name='status']")
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
    public WebElement testFindElement;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemButon;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[9]/span")
    public WebElement mesajButon;
     @FindBy(xpath = "//h2[@id='c-message-heading']/span[.='Messages']")
    public WebElement mesajSayfasiButon;
     @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[1]/span")
    public WebElement idButon;
     @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[2]/span")
    public WebElement nameButon;
     @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[3]/span")
    public WebElement emailButon;
     @FindBy(xpath = "//a[@id='jh-create-entity']/span[.='Create a new Message']")
    public WebElement newMesajButton;
     @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[3]/ul/li[9]/a")
    public WebElement ListSonElement;
     @FindBy(xpath = "//*[@id=\"c-message-name\"]")
    public WebElement newMesajName;
     @FindBy(xpath = "//*[@id=\"c-message-email\"]")
    public WebElement newMesajMail;
     @FindBy(xpath = "//*[@id=\"c-message-subject\"]")
    public WebElement newMesajKonu;
     @FindBy(xpath = "//*[@id=\"c-message-message\"]")
    public WebElement newMesajMesj;
     @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement newMesajSave;
    @FindBy(xpath= "/html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
    public WebElement messageKayitYesil;
    @FindBy(xpath= "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[2]")
    public WebElement editMesaj;
    @FindBy(xpath= "//*[@id=\"c-message-name\"]")
    public WebElement editMesajName;
    @FindBy(xpath= "/html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
    public WebElement editMesajYesilyazi;
@FindBy(xpath= "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[3]")
    public WebElement deleteMesaj;
@FindBy(xpath= "//button[@id='jhi-confirm-delete-cMessage']/span[.='Delete']")
    public WebElement acianPencereDelleted;
@FindBy(xpath= "/html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
    public WebElement deleteMesajYesilyazi;
@FindBy(xpath= "/html//button[@id='save-entity']")
    public WebElement editSaveButon;
@FindBy(xpath= "//*[@id=\"entity-menu\"]/div/a[7]")
    public WebElement countryButon;
@FindBy(xpath= "//*[@id=\"jh-create-entity\"]/span")
    public WebElement CreatNewCountry;
@FindBy(xpath= "//input[@id='country-name']")
    public WebElement CreatCountryName;
@FindBy(xpath= "//button[@id='save-entity']")
    public WebElement CreatCountryNameSave;
@FindBy(xpath= "/html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
    public WebElement CreatCountryNameSaveYesil;
@FindBy(xpath= "//a[@href='/country/230411/delete']")
    public WebElement CreatCountryDeleteButton;
@FindBy(xpath= "//*[@id=\"jhi-confirm-delete-country\"]")
    public WebElement ConfirmDelete;
@FindBy(xpath= "html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
    public WebElement ConfirmDeleteYesil;
@FindBy(xpath= "//a[@href='/country/230412']")
    public WebElement OlusturulanCountryİD;
@FindBy(xpath= "//td[.='TOBAGO'][1]")
    public WebElement OlusturulanCountryName;
@FindBy(xpath= "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/table/tbody/tr[972]/td[4]/div/a[3]")
    public WebElement OlusturulanCountryDel;
@FindBy(xpath= "//span[.='State/City']")
public WebElement cityButon;
@FindBy(xpath= "//span[.='Create a new State/City']")
public WebElement newcityButon;
@FindBy(xpath= "//input[@id='c-state-name']")
public WebElement newcitynameButon;
@FindBy(xpath= "/html//select[@id='c-state-state']")
public WebElement newcityUkeButon;
@FindBy(xpath= "/html//div[@id='root']//div[@class='app-container']//div[@role='alert']")
public WebElement newcityUkeButonKırmızı;
@FindBy(xpath= "//span[.='Save']")
public WebElement newcityUkeButonSave;

}