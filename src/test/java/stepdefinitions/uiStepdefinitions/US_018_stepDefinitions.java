package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US018Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.wait2;

public class US_018_stepDefinitions {

    US018Page us018Page=new US018Page();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait;
    Select select;

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    public static int doktorToplamSayisi_UI;


    @Given("Kullanici medunna sayfasinda")
    public void kullaniciMedunnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici logoya tiklar")
    public void kullaniciLogoyaTiklar() {
        wait2(5);
        us018Page.kullaniciLogo.click();
    }

    @Then("Kullanici ilk signin butonuna tiklar")
    public void kullaniciIlkSigninButonunaTiklar() {
        us018Page.firstSignInButton.click();
    }

    @And("Kullanici kullanici adi girer")
    public void kullaniciKullaniciAdiGirer() {
        ReusableMethods.waitFor(2);
        us018Page.usernameButton.sendKeys("team_60");
    }

    @And("Kullanici sifre girer")
    public void kullaniciSifreGirer() {
        ReusableMethods.waitFor(2);
        us018Page.passwordButton.sendKeys("123456tr*");
    }

    @And("Kullanici ikinci signin butonuna tiklar")
    public void kullaniciIkinciSigninButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us018Page.secondSignInButton.click();
    }


    @And("Admin clicks on Items&Titles Button")
    public void adminClicksOnItemsTitlesButton() {

        us018Page.itemsAndTitles.click();
    }

    @And("Admin clicks on Physician Button")
    public void adminClicksOnPhysicianButton() {
        us018Page.physician.click();
    }

    @And("Admin clicks Create a new Physician Button")
    public void adminClicksCreateANewPhysicianButton() {
        us018Page.createANewPhysician.click();
    }

    @And("admin administration sekmesine basar")
    public void adminAdministrationSekmesineBasar() {
        ReusableMethods.waitForVisibility(us018Page.administration, 10);
        us018Page.administration.click();
    }

    @And("admin user management sekmesine basar")
    public void adminUserManagementSekmesineBasar() {
        ReusableMethods.waitForVisibility(us018Page.userManagement, 10);
        us018Page.userManagement.click();
    }

    @And("admin create a new user sekmesine basar")
    public void adminCreateANewUserSekmesineBasar() {
        ReusableMethods.waitForVisibility(us018Page.createANewUser, 10);
        us018Page.createANewUser.click();
    }

    @And("admin login {string} firstname {string} lastname {string} mail {string} SSN {string} rol olarak doktor girer")
    public void adminLoginFirstnameLastnameMailSSNRolOlarakDoktorGirer(String login, String firstname, String lastname, String mail, String ssn) {
        ReusableMethods.waitForVisibility(us018Page.loginTextBox, 10);
        us018Page.loginTextBox.sendKeys(login);
        us018Page.firstNameTextBox.sendKeys(firstname);
        us018Page.lastNameTextBox.sendKeys(lastname);
        us018Page.emailTextBox.sendKeys(mail);
        us018Page.ssnTextBox.sendKeys(ssn);

        Select select = new Select(us018Page.roleDdm);
        select.selectByVisibleText("ROLE_PHYSICIAN");
    }

    @And("admin save tusuna basar")
    public void adminSaveTusunaBasar() {
        js.executeScript("arguments[0].scrollIntoView(true);", us018Page.medunnaText);
        ReusableMethods.waitForClickablility(us018Page.saveButton, 10);
        js.executeScript("arguments[0].click();", us018Page.saveButton);
    }


    @And("admin items&titles sekmesine basar")
    public void adminItemsTitlesSekmesineBasar() {
        ReusableMethods.waitForVisibility(us018Page.itemsAndTitles, 10);
        us018Page.itemsAndTitles.click();
    }

    @And("admin physician sekmesine basar")
    public void adminPhysicianSekmesineBasar() throws InterruptedException {
        ReusableMethods.waitForVisibility(us018Page.physician, 10);
        us018Page.physician.click();
        //ReusableMethods.waitFor(1);
        Thread.sleep(30000);
    }

    @And("admin create a new physician sekmesine basar")
    public void adminCreateANewPhysicianSekmesineBasar() {
        ReusableMethods.waitForVisibility(us018Page.createANewPhysician, 10);
        us018Page.createANewPhysician.click();
    }

    @Then("admin kayitli SSN {string} girer ve dogrulama mesajinin geldigini test eder")
    public void adminKayitliSSNGirerVeDogrulamaMesajininGeldiginiTestEder(String ssn) {
        ReusableMethods.waitForVisibility(us018Page.searchSSN, 10);
        us018Page.searchSSN.sendKeys(ssn);
        us018Page.searchUser.click();
        ReusableMethods.waitForVisibility(us018Page.dogrulamaMesaji, 10);
        Assert.assertTrue(us018Page.dogrulamaMesaji.isDisplayed());
        us018Page.dogrulamaMesaji.click();

    }


    @And("admin use search check box tiklar")
    public void adminUseSearchCheckBoxTiklar() {
        us018Page.useSSNSearchCheckBox.click();
        ReusableMethods.waitFor(1);
    }

    @And("admin tarih {string} girer")
    public void adminTarihGirer(String tarih) {
        us018Page.birthDate.clear();
        us018Page.birthDate.sendKeys(tarih);
        ReusableMethods.waitFor(1);
    }

    @And("admin telefon {string} girer")
    public void adminTelefonGirer(String tel) {
        us018Page.phone.clear();
        ReusableMethods.waitFor(1);
        us018Page.phone.sendKeys(tel);
        ReusableMethods.waitFor(1);
    }

    @And("admin adres {string} girer")
    public void adminAdresGirer(String address) {
        us018Page.adress.clear();
        us018Page.adress.sendKeys(address);
        ReusableMethods.waitFor(1);

    }

    @And("admin cinsiyet {string} belirler")
    public void adminCinsiyetBelirler(String gender) {

        select = new Select(us018Page.genderDdm);
        select.selectByVisibleText(gender);
        ReusableMethods.waitFor(1);
    }

    @And("admin uzmanlik {string} belirler")
    public void adminUzmanlikBelirler(String speciality) {

        select = new Select(us018Page.specialityDdm);
        select.selectByVisibleText(speciality);
        ReusableMethods.waitFor(1);
    }

    @And("admin kan grubu {string} secer")
    public void adminKanGrubuSecer(String bloodType) {

        select = new Select(us018Page.bloodGroupDdm);
        select.selectByVisibleText(bloodType);
        ReusableMethods.waitFor(1);
    }

    @And("admin description {string} girer")
    public void adminDescriptionGirer(String desc) {
        us018Page.description.clear();
        us018Page.description.sendKeys(desc);
        ReusableMethods.waitFor(1);
    }

    @And("admin fotograf yukler")
    public void adminFotografYukler() {
        String path = "C:\\Users\\aydin\\Desktop\\doktor.jpg";
        us018Page.dosyaSecButton.sendKeys(path);
    }

    @And("admin {string} dolar ucret belirler")
    public void adminDolarUcretBelirler(String exam) {
        js.executeScript("arguments[0].scrollIntoView(true);", us018Page.examFee);
        us018Page.examFee.clear();
        us018Page.examFee.sendKeys(exam);
        ReusableMethods.waitFor(1);
    }

    @And("admin {string} kullanici girer")
    public void adminKullaniciGirer(String user) {
        Select select = new Select(us018Page.userButton);
        select.selectByVisibleText(user);
        ReusableMethods.waitFor(1);
    }

    @And("admin country {string} secer")
    public void adminCountrySecer(String country) {
        Select select = new Select(us018Page.countryDdm);
        select.selectByVisibleText(country);
        ReusableMethods.waitFor(1);

    }

    @Then("create icin dogrulama mesajinin gorundugunu test eder")
    public void createIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertTrue(us018Page.dogrulamaMesaji3.isDisplayed());
    }

    @Then("admin butun doktorlarin bilgilerinin goruldugunu test eder")
    public void adminButunDoktorlarinBilgilerininGoruldugunuTestEder() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[2]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[3]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[4]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[5]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[6]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[7]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[8]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[9]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[10]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[11]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[12]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[13]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[14]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[15]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[16]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tbody//tr[1]//td[17]")).isDisplayed());
    }


    @And("admin edit butona tiklar")
    public void adminEditButonaTiklar() {
       // ReusableMethods.scroolDowntoPixel(600);
        ReusableMethods.waitForVisibility(us018Page.physicianEditButton, 5);
        js.executeScript("arguments[0].click();", us018Page.physicianEditButton);

    }




    @Then("edit icin dogrulama mesajinin gorundugunu test eder")
    public void editIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertFalse(us018Page.dogrulamaMesaji3.isDisplayed());
    }

    @And("admin delete butona tiklar")
    public void adminDeleteButonaTiklar() {
       // ReusableMethods.scroolDowntoPixel(600);
        ReusableMethods.waitForVisibility(us018Page.deleteButton, 5);
        js.executeScript("arguments[0].click();", us018Page.deleteButton);
    }

    @And("admin cikan uyari mesajinda delete butonuna basar")
    public void adminCikanUyariMesajindaDeleteButonunaBasar() {
        ReusableMethods.waitForVisibility(us018Page.deleteButton2, 5);
        us018Page.deleteButton2.click();
        ReusableMethods.waitFor(1);
    }

    @Then("delete icin dogrulama mesajinin gorundugunu test eder")
    public void deleteIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertTrue(us018Page.dogrulamaMesaji4.isDisplayed());
    }




}
