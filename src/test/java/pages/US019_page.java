package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US019_page {

    public US019_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    public WebElement staff;

    @FindBy(xpath = "//span[normalize-space()='Create a new Staff']")
    public WebElement createStaff;

    @FindBy(xpath = "//input[@id=\"useSSNSearch\"]")
    public WebElement useSearch;

    @FindBy(xpath = "//input[@id=\"searchSSN\"]")
    public WebElement ssnKutusu;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUser;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameKutusu;

    @FindBy(xpath = "//input[@id=\"staff-lastName\"]")
    public WebElement lastNameKutusu;

    @FindBy(xpath = "//input[@id='staff-birthDate']\n")
    public WebElement birthDay;

    @FindBy(xpath = "//input[@id=\"staff-phone\"]")
    public WebElement phoneKutusu;

    @FindBy(xpath = "//select[@id=\"staff-gender\"]")
    public WebElement genderDdm;

    @FindBy(xpath = "//select[@id=\"staff-bloodGroup\"]")
    public WebElement bloodGroupDdm;

    @FindBy(xpath = "//input[@id=\"staff-adress\"]")
    public WebElement addressKutusu;

    @FindBy(xpath = "//input[@id=\"staff-description\"]")
    public WebElement description;

    @FindBy(xpath = "//input[@id='staff-createdDate']")
    public WebElement hcreatedDate;

    @FindBy(xpath = "//select[@id='staff-user']")
    public  WebElement huser;

    @FindBy(xpath = "//select[@id=\"staff-country\"]")
    public WebElement countryDdm;

    @FindBy(xpath = "//select[@id=\"staff-cstate\"]")
    public WebElement stateCityDdm;

    @FindBy(xpath = "//button[@id=\"save-entity\"]")
    public WebElement saveButon;


    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[15]/div[1]/a[2]/span[1]/span[1]")
    public WebElement editButon;

    @FindBy(xpath = "(//a[@class=\"btn btn-danger btn-sm\"])[1]")
    public WebElement deleteButon;

    @FindBy(css = "div.app-container div.container-fluid.view-container:nth-child(4) div.jh-card.card:nth-child(1) div.view-routes div.table-responsive:nth-child(2) div.table-responsive table.table thead:nth-child(1) tr:nth-child(1) > th.hand:nth-child(1)")
    public WebElement sirala;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-staff']//span[contains(text(),'Delete')]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement userCagirText;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement silindiMesaj;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement kayitMesaji;




}
