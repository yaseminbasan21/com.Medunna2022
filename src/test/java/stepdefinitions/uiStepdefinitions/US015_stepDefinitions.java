package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US015_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US015_stepDefinitions {

    US015_page us015_page=new US015_page();
    Faker faker = new Faker();

    @Then("Admin geçerli bir username girer.")
    public void adminGeçerliBirUsernameGirer() {
        us015_page.usernameBox.sendKeys(ConfigReader.getProperty("Us015_adminUsername"));
        ReusableMethods.waitFor(3);
    }


    @Then("Admin geçerli bir password girer.")
    public void adminGeçerliBirPasswordGirer() {
        us015_page.passwordBox.sendKeys(ConfigReader.getProperty("Us015_adminPassword"));
        ReusableMethods.waitFor(3);
    }

    @Then("Admin giriş sign in butonuna tıklar.")
    public void adminGirişSignInButonunaTıklar() throws InterruptedException {
        us015_page.girisSignInButonu.click();
        Thread.sleep(3000);
    }

    @Then("Admin Items&Titles butonuna tıklar.")
    public void adminItemsTitlesButonunaTıklar() {
        us015_page.itemsTitlesButonu.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Patient butonuna tıklar.")
    public void adminPatientButonunaTıklar() {
        us015_page.patientButonu.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Create a new Patient butonuna tıklar.")
    public void adminCreateANewPatientButonunaTıklar() {
        us015_page.createANewPatientButonu.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin geçerli hasta bilgilerini girer.")
    public void adminGeçerliHastaBilgileriniGirer() {
        Driver.waitAndSendText(us015_page.firstNameBox,"Us15_"+faker.name().firstName());
        Driver.waitAndSendText(us015_page.lastNameBox,faker.name().lastName());
        Driver.waitAndSendText(us015_page.birthDateBox,"00"+faker.date().birthday().getTime());
        Driver.waitAndSendText(us015_page.emailBox,faker.internet().emailAddress());
        Driver.waitAndSendText(us015_page.phoneBox,faker.number().digits(10));
        Select select=new Select(us015_page.genderBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select = new Select(us015_page.bloodGroupBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        Driver.waitAndSendText(us015_page.addressBox,faker.address().streetAddress());
        Driver.waitAndSendText(us015_page.descriptionBox,faker.lorem().word());
        select=new Select(us015_page.userBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select=new Select(us015_page.countryBox);
        select.selectByVisibleText("USA");
        ReusableMethods.waitFor(3);
        select=new Select(us015_page.stateCityBox);
        select.selectByVisibleText("California");
        ReusableMethods.waitFor(3);


    }

    @Then("Admin Save butonuna tıklar ve A new Patient is created yazısını görüntüler.")
    public void adminSaveButonunaTıklarVeANewPatientIsCreatedYazısınıGörüntüler() {
        us015_page.saveButonu.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(ReusableMethods.waitForVisibility(us015_page.createdMesajı,5).isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Patients başlığını ve Patients başlığı altında hasta bilgilerini görebilmelidir.")
    public void adminPatientsBaşlığınıVePatientsBaşlığıAltındaHastaBilgileriniGörebilmelidir() {
        Assert.assertTrue(us015_page.patientsTitle.isDisplayed());

        // Assert.assertTrue(us015_page.id.isDisplayed());
        Assert.assertTrue(us015_page.ssn.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.firstName.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.lastName.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.birthDate.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.phone.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.gender.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.bloodGroup.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.address.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.description.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.createdDate.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.user.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.country.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us015_page.stateCity.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @Then("Admin Edit butonuna tıklar.")
    public void adminEditButonunaTıklar() {
        us015_page.patientEdit.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin tüm hasta bilgilerini görür.")
    public void adminTümHastaBilgileriniGörür() {
        Assert.assertTrue(us015_page.patientFirstName.isDisplayed());
        Assert.assertTrue(us015_page.patientLastname.isDisplayed());
        Assert.assertTrue(us015_page.patientBirthDate.isDisplayed());
        Assert.assertTrue(us015_page.patientPhone.isDisplayed());
        Assert.assertTrue(us015_page.patientGender.isDisplayed());
        Assert.assertTrue(us015_page.patientBloodGroup.isDisplayed());
        Assert.assertTrue(us015_page.patientAddress.isDisplayed());
        Assert.assertTrue(us015_page.patientDescripton.isDisplayed());
        Assert.assertTrue(us015_page.patientUser.isDisplayed());
        Assert.assertTrue(us015_page.patientCountry.isDisplayed());
        Assert.assertTrue(us015_page.patientStateCity.isDisplayed());
    }


    @Then("Admin Country ve State butonlarını görür.")
    public void adminCountryVeStateButonlarınıGörür() {
        Assert.assertTrue(us015_page.patientCountry.isDisplayed());
        Assert.assertTrue(us015_page.patientStateCity.isDisplayed());
    }

    @Then("Admin geçerli hasta bilgilerini girer ve Country olarak USA seçer.")
    public void adminGeçerliHastaBilgileriniGirerVeCountryOlarakUSASeçer() {
        Driver.waitAndSendText(us015_page.firstNameBox,"Us15_"+faker.name().firstName());
        Driver.waitAndSendText(us015_page.lastNameBox,faker.name().lastName());
        Driver.waitAndSendText(us015_page.birthDateBox,"00"+faker.date().birthday().getTime());
        Driver.waitAndSendText(us015_page.emailBox,faker.internet().emailAddress());
        Driver.waitAndSendText(us015_page.phoneBox,faker.number().digits(10));
        Select select=new Select(us015_page.genderBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select = new Select(us015_page.bloodGroupBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        Driver.waitAndSendText(us015_page.addressBox,faker.address().streetAddress());
        Driver.waitAndSendText(us015_page.descriptionBox,faker.lorem().word());
        select=new Select(us015_page.userBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select=new Select(us015_page.countryBox);
        select.selectByVisibleText("USA");
        ReusableMethods.waitFor(3);
    }


    @Then("Admin State olarak California seçer.")
    public void adminStateOlarakCaliforniaSeçer() {
        Select select=new Select(us015_page.stateCityBox);
        select.selectByVisibleText("California");
        ReusableMethods.waitFor(3);
    }


    @Then("Admin geçerli hasta bilgilerini girer ve Country olarak Fas seçer.")
    public void adminGeçerliHastaBilgileriniGirerVeCountryOlarakFasSeçer() {
        Driver.waitAndSendText(us015_page.firstNameBox,"Us15_"+faker.name().firstName());
        Driver.waitAndSendText(us015_page.lastNameBox,faker.name().lastName());
        Driver.waitAndSendText(us015_page.birthDateBox,"00"+faker.date().birthday().getTime());
        Driver.waitAndSendText(us015_page.emailBox,faker.internet().emailAddress());
        Driver.waitAndSendText(us015_page.phoneBox,faker.number().digits(10));
        Select select=new Select(us015_page.genderBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select = new Select(us015_page.bloodGroupBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        Driver.waitAndSendText(us015_page.addressBox,faker.address().streetAddress());
        Driver.waitAndSendText(us015_page.descriptionBox,faker.lorem().word());
        select=new Select(us015_page.userBox);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
        select=new Select(us015_page.countryBox);
        select.selectByVisibleText("Fas");
        ReusableMethods.waitFor(3);
    }

    @Then("Admin State bilgisi girmez ve Save butonuna tıklar.")
    public void adminStateBilgisiGirmezVeSaveButonunaTıklar() {
        us015_page.saveButonu.submit();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin A new Patient is created yazısını görüntüleyememelidir.")
    public void adminANewPatientIsCreatedYazısınıGörüntüleyememelidir() {
        Assert.assertFalse(us015_page.createdMesajı.isDisplayed());
    }

    @Then("Admin hastayı silmek için Delete butonuna tıklar.")
    public void adminHastayıSilmekIçinDeleteButonunaTıklar() {
        us015_page.deleteButonu.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin onay kutusunun Delete butonuna tıklar ve hastayı siler.")
    public void adminOnayKutusununDeleteButonunaTıklarVeHastayıSiler() {
        us015_page.onayKutDeleteButonu.click();
        ReusableMethods.waitFor(3);
        Assert.assertFalse(us015_page.hataMesajı.isDisplayed());
        ReusableMethods.waitFor(3);
    }


    @Then("Admin Appointment butonuna tıklar.")
    public void adminAppointmentButonunaTıklar() {
        us015_page.appointmentButonu.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Appointments'ları görür.")
    public void adminAppointmentsLarıGörür() {
        Assert.assertTrue(us015_page.appointmentsTitle.isDisplayed());
        //ReusableMethods.waitFor(20);
    }

    @Then("Admin ilgili hastanın Edit butonuna tıklar.")
    public void adminIlgiliHastanınEditButonunaTıklar() {
        Driver.waitForVisibility(us015_page.appointmentEdit,10);
        // ReusableMethods.waitFor(3);
        us015_page.appointmentEdit.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Physician butonuna tıklar ve hastaya doktor atar.")
    public void adminPhysicianButonunaTıklarVeHastayaDoktorAtar() {
        us015_page.physicianButonu.clear();
        ReusableMethods.waitFor(3);
        us015_page.physicianButonu.click();
        Select select = new Select(us015_page.physicianButonu);
        US015_stepDefinitions.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Save butonuna tıklar.")
    public void adminSaveButonunaTıklar() {
        us015_page.appointmentSaveButonu.click();
        ReusableMethods.waitFor(3);
    }
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }
}
