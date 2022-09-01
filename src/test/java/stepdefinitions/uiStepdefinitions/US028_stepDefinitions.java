package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US011_page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US028_stepDefinitions {
    SoftAssert softAssert = new SoftAssert();
    US011_page us011Page = new US011_page();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici URL Adresine Gider.")
    public void kullanici_url_adresine_gider() throws InterruptedException { Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(2222);

    }

    @Then("Kullanici Singin Butonuna Tıklar  Username  ve Sifre Girilir Sing Butonuna Tıklanir Admin olarak Giris Yapiir")
    public void kullanici_singin_butonuna_tıklar_username_ve_sifre_girilir_sing_butonuna_tıklanir_admin_olarak_giris_yapiir() throws InterruptedException {
        us011Page.profil.click();
        us011Page.Sing_in.click();
        us011Page.username.sendKeys("team55.");
        us011Page.password.sendKeys("Team55..");
        Thread.sleep(3333);
        us011Page.SİNG_İN.click();
        Thread.sleep(3333);
    }

    @Then("Kullanici  {string} Butonuna Tiklar")
    public void kullanici_butonuna_tiklar(String string) throws InterruptedException {
        us011Page.itemButon.click();
        Thread.sleep(3333);

    }

    @Then("Kullanici Acilan  Menuden {string} Secenegine Tiklanir")
    public void kullanici_acilan_menuden_secenegine_tiklanir(String string) throws InterruptedException {
        us011Page.countryButon.click();
        Thread.sleep(3333);

    }

    @Then("Kullanici Acilan  Menuden A New Country Secenegine Tiklanir")
    public void kullanici_acilan_menuden_a_new_country_secenegine_tiklanir() throws InterruptedException {
        us011Page.CreatNewCountry.click();
        Thread.sleep(3333);
    }

    @Then("Kullanici Acilan  Menuden Ulke İsmi Girilir Save Butonuna Tiklanir")
    public void kullanici_acilan_menuden_ulke_ismi_girilir_save_butonuna_tiklanir() throws InterruptedException {
        us011Page.CreatCountryName.sendKeys("TOBAGO");
        us011Page.CreatCountryNameSave.click();

        softAssert.assertTrue(us011Page.messageKayitYesil.getText().contains("A new Country is created with identifier"));
        Thread.sleep(5555);

    }

    @Then("Kullanici Yeni Bir Ulke Olustu Yesil Yazisini Gorur")
    public void kullanici_yeni_bir_ulke_olustu_yesil_yazisini_gorur() throws InterruptedException {
        Thread.sleep(1111);


    }

    @Then("Kullanici Olusturulan Yeni Ulke İsmi İle Bulunur ve Delete Butonuna Tiklanir")
    public void kullanici_olusturulan_yeni_ulke_ismi_ile_bulunur_ve_delete_butonuna_tiklanir() throws InterruptedException {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", us011Page.OlusturulanCountryName);
        Thread.sleep(3333);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        us011Page.ConfirmDelete.click();

        Thread.sleep(2222);
    }


    @Then("Kullanici Silenen Ulkenin Silindi  Yesil Yaziyi Gorur")
    public void kullanici_silenen_ulkenin_silindi_yesil_yaziyi_gorur() throws InterruptedException {
        softAssert.assertTrue(us011Page.ConfirmDeleteYesil.getText().contains("A Country is deleted with identifier"));
        Thread.sleep(2222);
    }

    @Then("Kullanici Acilan  Menuden A New City Butonuna Tiklanir")
    public void kullanici_acilan_menuden_a_new_city_butonuna_tiklanir() throws InterruptedException {
        us011Page.itemButon.click();
        us011Page.cityButon.click();
        us011Page.newcityButon.click();
        us011Page.newcitynameButon.sendKeys("EGO");
        us011Page.newcityUkeButon.click();
        actions.sendKeys("T"+"O").perform();
        us011Page.newcityUkeButonSave.click();
        Thread.sleep(2222);
        softAssert.assertFalse(us011Page.ConfirmDeleteYesil.getText().contains("Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!"));
        Thread.sleep(3333);

    }

    @Then("Kullanici Olusturulan Ulkeyi Bulur ve Yeni Sehir Yazilir Save Butonuna Tiklanir")
    public void kullanici_olusturulan_ulkeyi_bulur_ve_yeni_sehir_yazilir_save_butonuna_tiklanir() {

    }

    @Then("Kullanici Sehir Eklendi Yesil Yaziyi Gormelidir")
    public void kullanici_sehir_eklendi_yesil_yaziyi_gormelidir() {

    }


}
