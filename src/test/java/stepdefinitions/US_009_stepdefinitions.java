package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US009_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009_stepdefinitions {

    US009_page us009_page;

    @Given("TG kullanici {string} sayfasina gider")
    public void tg_kullanici_sayfasina_gider(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));

    }

    @Given("TG sayfanin sağ üst köşesinde yeralan insan ikonuna tıklar")
    public void tg_sayfanin_sağ_üst_köşesinde_yeralan_insan_ikonuna_tıklar() {

        us009_page=new US009_page();
        us009_page.anasayfaInsanIkonu.click();
    }

    @Then("TG acilan dropdown menude Sign in butonuna tıklar")
    public void tg_acilan_dropdown_menude_sign_in_butonuna_tıklar() {
        us009_page=new US009_page();
        us009_page.anasayfaInsanIkonuSignInElementi.click();

    }

    @Then("TG username olarak {string} girer")
    public void tg_username_olarak_girer(String string) {
        us009_page=new US009_page();
        us009_page.loginUsernameTextBox.sendKeys(ConfigReader.getProperty("StaffUsernameTG"));

    }

    @Then("TG password olarak {string} girer")
    public void tg_password_olarak_girer(String string) {
        us009_page=new US009_page();
        us009_page.loginPasswordTextBox.sendKeys(ConfigReader.getProperty("StaffPasswordTG"));

    }

    @Then("TG Sign in butonuna basar")
    public void tg_sign_in_butonuna_basar() {
        us009_page=new US009_page();
        us009_page.loginSignInButonu.click();

    }

    @Then("TG MYPAGES dropdown menusune tıklar")
    public void tg_mypages_dropdown_menusune_tıklar() {
        us009_page=new US009_page();
        us009_page.myPagesDropdownMenuElementi.click();

    }

    @Then("TG Search Patient butonuna tıklar")
    public void tg_search_patient_butonuna_tıklar() {
        us009_page=new US009_page();
        us009_page.myPagesDropdownMenuSearchPatientElementi.click();

    }

    @Then("TG Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder")
    public void tg_patients_tablosunun_ve_hasta_bilgilerinin_gorunur_oldugunu_test_eder() {
        us009_page=new US009_page();
        Assert.assertTrue(us009_page.patientsTableElementi.isDisplayed());

    }

    @Then("TG sayfayi kapatir")
    public void tg_sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("TG Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar")
    public void tg_tabloda_bilgilerini_düzenlenmek_istedigi_hastanın_yanındaki_edit_butonuna_tıklar() {

        us009_page=new US009_page();
        us009_page.patientsTableHastaEditElementi.click();
    }

    @Then("TG Hasta bilgilerinin düzenlenebilir oldugunu test eder")
    public void tg_hasta_bilgilerinin_düzenlenebilir_oldugunu_test_eder() {
        us009_page=new US009_page();
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeLastNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeBirthDateTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeEmailTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemePhoneTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeGenderSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeBloodGroupSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeDescriptionTextBoxElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeUserSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeCountrySelectMenuElementi.isEnabled());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeStateSelectMenuElementi.isEnabled());

    }

    @Then("TG Patient SSN kısmına hastanın SSN bilgisini girer")
    public void tg_patient_ssn_kısmına_hastanın_ssn_bilgisini_girer() {
        us009_page=new US009_page();
        us009_page.patientsTableSSNsearchTextBox.sendKeys("123-45-6799");

    }

    @Then("TG Ilgili hastanın yanındaki view butonuna tıklar")
    public void tg_ılgili_hastanın_yanındaki_view_butonuna_tıklar() {

        us009_page=new US009_page();
        us009_page.patientsTableHastaViewElementi.click();
    }

    @Then("TG kayit bilgilerinin gorunur oldugunu test eder")
    public void tg_kayit_bilgilerinin_gorunur_oldugunu_test_eder() {

        us009_page=new US009_page();
        Assert.assertTrue(us009_page.hastaBilgisiGoruntulemeSSNElementi.isDisplayed());
    }

    @Then("TG {int} saniye bekler")
    public void tg_saniye_bekler(Integer int1) throws InterruptedException {
        Thread.sleep(1000);

    }

    @Then("TG kayit bilgilerini siler ve Save butonuna tıklar")
    public void tg_kayit_bilgilerini_siler_ve_save_butonuna_tıklar() throws InterruptedException {
        us009_page=new US009_page();
        Actions actions = new Actions(Driver.getDriver());
        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        us009_page.hastaBilgileriGuncellemeSaveButonuElementi.click();

    }

    @Then("TG bilgilerin silinip silinmedigini test eder")
    public void tg_bilgilerin_silinip_silinmedigini_test_eder() {
        us009_page=new US009_page();
        Assert.assertTrue(us009_page.alertButton.isDisplayed());

    }

    @Then("TG Hasta idsini silemedigini test eder")
    public void tg_hasta_idsini_silemedigini_test_eder() {

        Assert.assertTrue(us009_page.hastaBilgileriGuncellemeIdTextBoxElementi.isEnabled());
    }
    @Then("TG Arama yapabildigini ve istenilen hastanın gorunur oldugunu test eder")
    public void tg_arama_yapabildigini_ve_istenilen_hastanın_gorunur_oldugunu_test_eder() {
        us009_page=new US009_page();
        Assert.assertTrue(us009_page.arananHastaId.isDisplayed());

    }


}
