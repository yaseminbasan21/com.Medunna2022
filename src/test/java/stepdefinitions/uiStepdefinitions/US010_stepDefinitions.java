package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US010_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US010_stepDefinitions {

    US010_page us010_page =new US010_page();

    @Given("{string} e gidilir.")
    public void eGidilir(String medunnaUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
    }

    @Then("Sign in butonu tiklanir.")
    public void signInButonuTiklanir() {
        ReusableMethods.waitFor(2);
        us010_page.signInIkon.click();
        us010_page.signIn.click();
    }


    @And("SignIn butonu tiklanir.")
    public void signinButonuTiklanir() {
        ReusableMethods.waitFor(2);
        us010_page.signInOk.click();
    }

    @Given("Kullanici kayitli oldugu {string} i girmelidir.")
    public void kullaniciKayitliOlduguIGirmelidir(String DoktorUserName) {

        ReusableMethods.waitFor(2);
        us010_page.username.sendKeys(ConfigReader.getProperty(DoktorUserName));

    }

    @And("Kullanici kayitli {string} u girmelidir")
    public void kullaniciKayitliUGirmelidir(String DoktorPassword) {

        ReusableMethods.waitFor(2);
        us010_page.password.sendKeys(ConfigReader.getProperty(DoktorPassword));

    }

    @And("Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.")
    public void acilanSayfadaGirilenKullaniciIsmininGorunurOlduguTestEdilir() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(us010_page.kullaniciIsimDog.isDisplayed());

    }

    @And("MY PAGES butonuna tiklar ve menuden My Appointment secenegini tiklar.")
    public void myPAGESButonunaTiklarVeMenudenMyAppointmentSeceneginiTiklar() {

        ReusableMethods.waitFor(2);
        us010_page.myPages.click();
        us010_page.myAppointments.click();
    }

    @And("Acilan sayfada Appointments yazisinin gorunur oldugu test edilir.")
    public void acilanSayfadaAppointmentsYazisininGorunurOlduguTestEdilir() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(us010_page.appointmentsText.isDisplayed());
    }

    @And("Acilan sayfada randevu listesi ve zaman dilimlerinin gorunur oldugu test edilir.")
    public void acilanSayfadaRandevuListesiVeZamanDilimlerininGorunurOlduguTestEdilir() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(us010_page.zamanDilimi.isDisplayed());

        List<WebElement> randevuListesi=Driver.getDriver().findElements(By.xpath("//tbody//tr"));

        for (WebElement each: randevuListesi) {
            System.out.println(each.isDisplayed());
        }

    }

    @And("Sayfa kapatilir.")
    public void sayfaKapatilir() {

        Driver.closeDriver();

    }

    @And("Acilan sayfada patient id, start date, end date ve status bilgilerinin gorunur oldugu test edilir.")
    public void acilanSayfadaPatientIdStartDateEndDateVeStatusBilgilerininGorunurOlduguTestEdilir() {

        ReusableMethods.waitFor(3);
        Assert.assertTrue(us010_page.ptientId.isDisplayed());
        Assert.assertTrue(us010_page.startDateTime.isDisplayed());
        Assert.assertTrue(us010_page.endDateTime.isDisplayed());
        Assert.assertTrue(us010_page.status.isDisplayed());
    }



}
