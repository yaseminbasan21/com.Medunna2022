package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US010_page {

    public US010_page(){PageFactory.initElements(Driver.getDriver(),this);}

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

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPages;

    @FindBy(id="account-menu")
    public WebElement kullaniciIsimDog;

    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(id="appointment-heading")
    public WebElement appointmentsText;

    @FindBy(xpath = "//tbody//tr")
    public WebElement randevuListesi;

    @FindBy(id = "fromDate")
    public WebElement zamanDilimi;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public WebElement ptientId;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public WebElement startDateTime;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public WebElement endDateTime;

    @FindBy(xpath = "//tbody//tr//td[4]")
    public WebElement status;




}
