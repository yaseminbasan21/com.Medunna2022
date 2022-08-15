package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.US013_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_13_stepdefinitions {

    US013_page us013 = new US013_page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("doktorHatice {string} anasayfasinda")
    public void doktor_hatice_anasayfasinda(String string) {
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("hMedunnaUrl"));
    }

    @Then("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        us013.login.click();

    }

    @Then("doktorHatice sing in tiklar")
    public void doktor_hatice_sing_in_tiklar() {
        ReusableMethods.waitFor(2);
        us013.singInButonu.click();

    }

    @Then("doktorHatice username ve password girer")
    public void doktor_hatice_username_ve_password_girer() {
        ReusableMethods.waitFor(2);
        us013.username.sendKeys(ConfigReader.getProperty("hdoktorusername"));
        us013.password.sendKeys(ConfigReader.getProperty("hdoktorpassword"));
    }

    @Then("doktorHatice sing in butonununa tiklar")
    public void doktor_hatice_sing_in_butonununa_tiklar() {
        ReusableMethods.waitFor(2);
        us013.singInEnter.click();
    }

    @Then("My pages butonunu tiklar")
    public void my_pages_butonunu_tiklar() {
        ReusableMethods.waitFor(2);
        us013.myPagesButonu.click();

    }

    @Then("My Appointments sekmesini tiklar")
    public void my_appointments_sekmesini_tiklar() {
        ReusableMethods.waitFor(2);
        us013.myAppointmentsButonu.click();

    }

    @Then("hasta bilgilerinden edit butonunan tiklar")
    public void hasta_bilgilerinden_edit_butonunan_tiklar() {
        ReusableMethods.waitFor(2);
        us013.editButonu.click();
    }

    @Then("doktorHatice acilan sayfada Show Test Result butonuna tiklar")
    public void doktor_hatice_acilan_sayfada_show_test_result_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        us013.showTestResultsButonu.click();
    }

    @Then("doktorHatice tests sayfasinda View Results butonuna tiklar")
    public void doktor_hatice_tests_sayfasinda_view_results_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        us013.viewButonu.click();
    }

    @Then("doktorHatice test sonuc sayfasini gorur")
    public void doktor_hatice_test_sonuc_sayfasini_gorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.idBaslik.isEnabled());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.nameBaslik.isEnabled());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.defultMinValue.isEnabled());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.defultMaxValue.isEnabled());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.testBaslik.isEnabled());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us013.dateBaslik.isEnabled());
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }

    @Then("doktorHatice Request Inpatient secenegini tiklar")
    public void doktor_hatice_request_ınpatient_secenegini_tiklar() {
        ReusableMethods.waitFor(3);
        us013.requestImpatientButonu.click();
        Assert.assertTrue(Driver.waitForVisibility(us013.inpatientMessage, 2).isDisplayed());
    }


    @Then("doktorHatice sayfayi kapatir")
    public void doktor_hatice_sayfayi_kapatir() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }


}
