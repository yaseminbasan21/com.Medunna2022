package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US024_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US024_stepDefinitions {
    US024_page us024_page = new US024_page();

    @Given("Hasta Medunna sayfasına gider")
    public void hasta_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Given("Hasta girise tiklar")
    public void hasta_girise_tiklar() {

        us024_page.insanIkonuElementi.click();


    }
    @Given("Hasta sign in sekmesine tiklar")
    public void hasta_sign_in_sekmesine_tiklar() throws InterruptedException {

        Thread.sleep(1000);
        us024_page.signinSekmesiElementi.click();

    }
    @Then("Hasta username girer")
    public void hasta_username_girer() {
        us024_page.usernameTextbox.click();
        us024_page.usernameTextbox.clear();
        us024_page.usernameTextbox.sendKeys("hasta.ali");

    }
    @Then("Hasta password girer")
    public void hasta_password_girer() {
        us024_page.passwordTextBox.click();
        us024_page.passwordTextBox.clear();
        us024_page.passwordTextBox.sendKeys("hastalik.44A");
    }
    @Then("Hasta sign in butonuna tiklar")
    public void hasta_sign_in_butonuna_tiklar() {
        us024_page.signinBotunuElementi.click();
    }
    @Then("Hasta giris yapildigini dogrular")
    public void hasta_giris_yapildigini_dogrular() {
        us024_page.girisYapildi.isDisplayed();

    }
    @Then("Hasta my pages'e tiklar")
    public void hasta_my_pages_e_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        us024_page.mypagesSekmesiElementi.click();

    }
    @Then("Hasta My Appointments tiklar")
    public void hasta_my_appointments_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        us024_page.myappointmentsElementi.click();
    }
    @Then("Hasta randevu listesini gorur")
    public void hasta_randevu_listesini_gorur() {

        us024_page.appointmentsRandevuSayfasi.isDisplayed();

    }
    @Then("Hasta from kismina tarih girer")
    public void hasta_from_kismina_tarih_girer() throws InterruptedException {
        Thread.sleep(1000);
        us024_page.fromDateTextBox.click();
        us024_page.fromDateTextBox.sendKeys("23.08.2022");
        Thread.sleep(2000);

    }
    @Then("Hasta to kismina tarih girer")
    public void hasta_to_kismina_tarih_girer() {
        us024_page.toDateTextBox.click();
        us024_page.toDateTextBox.sendKeys("23.08.2022");

    }
    @Then("Hasta Show Tests 'e tiklar")
    public void hasta_show_tests_e_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        us024_page.showTestSekmesi.click();

    }
    @Then("Hasta view  Results'a tiklar")
    public void hasta_view_results_a_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        us024_page.viewResultsElementi.click();

    }
    @Then("Hasta Test sonuclarinda id,name,test,default max ve min value,date and description bolumlerini gorur")
    public void hasta_test_sonuclarinda_id_name_test_default_max_ve_min_value_date_and_description_bolumlerini_gorur() throws InterruptedException, IOException, IOException, IOException {


        Thread.sleep(2000);
        ReusableMethods.getScreenshot("Result Test");
        Assert.assertTrue(us024_page.idDegeri.isDisplayed());
        Assert.assertTrue(us024_page.nameDegeri.isDisplayed());
        Assert.assertTrue(us024_page.defaultMinValueDegeri.isDisplayed());
        Assert.assertTrue(us024_page.defaultMaxValueDegeri.isDisplayed());
        Assert.assertTrue(us024_page.testDegeri.isDisplayed());
        Assert.assertTrue(us024_page.dateDegeri.isDisplayed());

        Driver.closeDriver();

    }


    @And("Hasta Show Invoice 'e tiklar")
    public void hasta_Show_Invoice_Tiklar() throws InterruptedException {

        Thread.sleep(2000);
        us024_page.ShowInvoiceSekmesi.click();
    }

    @Then("Hasta faturayi gordugunu dogrular")
    public void hasta_Faturayi_Gordugunu_Dogrular() throws InterruptedException, IOException {

        Thread.sleep(3000);


        ReusableMethods.hooverByJS(us024_page.faturaResmi);
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("FATURA CASH MANİ");
        Assert.assertTrue(us024_page.faturaYazisiElementi.isDisplayed());
    }

    @And("Sayfayi kapatir")
    public void sayfayi_Kapatir() {

        Driver.closeDriver();
    }
}





