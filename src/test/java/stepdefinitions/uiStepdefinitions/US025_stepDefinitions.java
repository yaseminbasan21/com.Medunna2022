package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US025_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US025_stepDefinitions {
    US025_page us25_pages = new US025_page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    /*
        @Given("Hasta Medunna sayfasina gider")
        public void hasta_medunna_sayfasina_gider() {

            Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

        }
        @Given("Hasta girise tiklar")
        public void hasta_girise_tiklar() {

            us25_pages.insanIkonuElementi.click();

        }
        @Given("Hasta sign in sekmesine tiklar")
        public void hasta_sign_in_sekmesine_tiklar() throws InterruptedException {
            Thread.sleep(1000);
            us25_pages.signinSekmesiElementi.click();

        }
        @Then("Hasta Username girer")
        public void hasta_username_girer() {


            us25_pages.UsernameTextbox.click();
            us25_pages.UsernameTextbox.clear();
            us25_pages.UsernameTextbox.sendKeys("hasta.ali");


        }
        @Then("Hasta Password girer")
        public void hasta_password_girer() throws InterruptedException {
            Thread.sleep(1000);

            us25_pages.PasswordTextBox.click();
            us25_pages.PasswordTextBox.clear();
            us25_pages.PasswordTextBox.sendKeys("hastalik.44A");

        }
        @Then("Hasta sign in butonuna tiklar")
        public void hasta_signin_butonuna_tiklar() {
            us25_pages.signinBotunuElementi.click();

        }
        @Then("Hasta giris yapilabiligini dogrular")
        public void hasta_giris_yapilabiligini_dogrular() throws InterruptedException {

            Thread.sleep(100);
            Assert.assertTrue(us25_pages.girisYapilabildiYazisi.isDisplayed());

        }
        @Then("Hasta My pages'e tiklar")
        public void hasta_my_pages_e_tiklar() throws InterruptedException {
            Thread.sleep(1000);

            us25_pages.MypagesSekmesiElementi.click();

        }

     */
    @And("Hasta Make an Appointment tiklar")
    public void hasta_MakeAn_Appointment_Tiklar() throws InterruptedException {
        Thread.sleep(1000);

        us25_pages.makeanAppointmentElementi.click();
    }

    @Then("Hasta acilan sayfada bilgileri doldurur")
    public void hasta_acilan_sayfada_bilgileri_doldurur() throws InterruptedException {


        Thread.sleep(1000);
        us25_pages.firstnameTextbox.click();
        us25_pages.firstnameTextbox.clear();
        us25_pages.firstnameTextbox.click();
        actions.sendKeys(faker.name().firstName() + Keys.TAB)
                .sendKeys(faker.internet().password() + Keys.TAB)
                .sendKeys(faker.idNumber().ssnValid() + Keys.TAB)
                .sendKeys(faker.internet().emailAddress() + Keys.TAB)
                .sendKeys("212-212-2121" + Keys.TAB)
                .sendKeys("26.08.2022" + Keys.TAB).perform();
        Thread.sleep(1000);
    }

    @Then("Hasta Send an Appointment Request tiklar")
    public void hasta_send_an_appointment_request_tiklar() {
        us25_pages.SendanAppointmentRequestElementi.click();

    }

    @Then("Hasta randevu aldigini dogrular")
    public void patient_randevu_aldigini_dogrular() throws InterruptedException, IOException {
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("randevuAlindiYazisi");
        us25_pages.randevualindiYazisi.isDisplayed();



    }
}





