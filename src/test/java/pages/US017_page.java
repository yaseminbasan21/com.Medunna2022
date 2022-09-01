package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class US017_page {
        public US017_page() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
        public WebElement hesapButonu;

        @FindBy(xpath = "//span[text()='Sign in']")
        public WebElement singIn;

        @FindBy(xpath = "//input[@name='username']")
        public WebElement username;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement singInEnter;

        @FindBy(xpath = "(//li[@class='dropdown nav-item'])[1]")
        public WebElement itemsTitles;
        //@FindBy(xpath = "//*[text()='Items&Titles']")

        @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
        public WebElement testItems;

        @FindBy(xpath = "//span[text()='Test Items']")
        public WebElement testItemsBasligi;

        @FindBy(xpath = "//span[text()='Create a new Test Item']")
        public WebElement createTestItemsButonu;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement name;

        @FindBy(xpath = "//input[@name='description']")
        public WebElement description;

        @FindBy(xpath = "//input[@name='price']")
        public WebElement price;

        @FindBy(xpath = "//input[@name='defaultValMin']")
        public WebElement defaultValMin;

        @FindBy(xpath = "//input[@name='defaultValMax']" )
        public WebElement defaultValMax;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement saveButonu;

        @FindBy(xpath = "//div[@class='Toastify__toast-body']")
        public WebElement kayitBasariliYazisi;

        @FindBy(xpath = "//span[text()='Edit']")
        public WebElement editButonu;

        @FindBy(xpath = "(//span[text()='View'])[5]")
        public WebElement viewButonu;

        @FindBy(xpath = "//span[text()='Name']")
        public WebElement nameBaslik;

        @FindBy(xpath = "//span[text()='Description']")
        public WebElement descriptionBaslik;

        @FindBy(xpath = "//span[text()='Price']")
        public WebElement priceBaslik;

        @FindBy(xpath = "//span[text()='Default Min. Value']")
        public WebElement defaultValMinBaslik;

        @FindBy(xpath = "//span[text()='Default Max. Value']")
        public WebElement defaultValMaxBaslik;

        @FindBy(xpath = "//span[text()='Created Date']")
        public WebElement createDateBaslik;

        @FindBy(xpath = "//span[text()='Back']")
        public WebElement backButonu;

        @FindBy(xpath = "//span[text()='team55 team55']")
        public WebElement hesap2Butonu;

        @FindBy(xpath = "(//span[text()='Delete'])[1]")
        public WebElement deleteButonu;

        @FindBy(xpath = "//button[@id='jhi-confirm-delete-cTestItem']")
        public WebElement deleteButonu2;

        @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
        public WebElement deleteSilindiMesaji;

        @FindBy(xpath = "//span[text()='Sign out']")
        public WebElement singoutButonu;

    }


