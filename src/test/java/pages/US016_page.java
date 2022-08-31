package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US016_page {

    public US016_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement ikon;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement firstSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement secondSignIn;

    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//*[text()='Room']")
    public WebElement room;

   @FindBy(xpath = "//span[normalize-space()='Create a new Room']")
    public WebElement createNewButon;

   @FindBy(xpath = "//*[text()='Create or edit a Room']")
    public WebElement createText;

   @FindBy(xpath = "//input[@id='room-roomNumber']")
    public WebElement roomNumberTextBox;

   @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement requirementEmpty;

   @FindBy(xpath = "//*[text()='This field should be a number.']")
    public WebElement requrimentIncorrect;

   @FindBy(xpath = "//*[text()='Room Type']")
    public WebElement roomTypeDropDown;

   @FindBy(xpath = "//input[@id='room-status']")
    public WebElement statusButon;

   @FindBy(xpath = "//input[@id='room-price']")
    public WebElement priceTextbox;

   @FindBy(xpath = "//*[text()='This field should be at least 0.']")
    public WebElement priceIncorrect;

   @FindBy(xpath = "//input[@id='room-description']")
    public WebElement description;

   @FindBy(xpath = "//input[@id='room-createdDate']")
    public WebElement createDate;

   @FindBy(xpath = "//*[text()='Save']")
   public WebElement saveButon;

   @FindBy(css = "div[@role='alert']")
   //div[@class='Toastify__toast-body']
   public WebElement saveText;

   @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement roomTypeButon; //tr//th[3]

    @FindBy(xpath = "//a[normalize-space()='»»']")
    public WebElement pageOkButon;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement edit;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement id;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButon;

    @FindBy(xpath = "//*[text()='Delete']")//div[@role='alert']
    public WebElement deleteButon;

    @FindBy(id = "jhi-confirm-delete-room")
    public WebElement deleteButon2;

    @FindBy(xpath = "(//div[@role='alert'])[1]") //div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container'
    public WebElement deleteText;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement updateText;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement kayitMesaji;


}
