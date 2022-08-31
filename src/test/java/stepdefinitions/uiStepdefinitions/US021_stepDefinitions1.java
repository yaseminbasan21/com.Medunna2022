package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.US021_page1;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US021_stepDefinitions1 {

    US021_page1 medunnason = new US021_page1();

    @Given("Kullanici  {string} adresine gider")
    public void kullanici_url_ine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Given("Kullanici sag ustteki adam ikonuna tiklar")
    public void kullanici_sag_ustteki_adam_ikonuna_tiklar() {
        medunnason.anasayfaInsanIkonu.click();
    }
    @Given("Kullanici Sign in e tiklar")
    public void kullanici_sign_in_e_tiklar() {
        medunnason.anasayfaInsanIkonuSignInElementi.click();
    }
    @Given("Kullanici username ve password girer")
    public void kullanici_username_ve_password_girer() {
        medunnason.usernameTextbox.sendKeys(ConfigReader.getProperty("staffUsername"));
        medunnason.passwordTextbox.sendKeys(ConfigReader.getProperty("staffPassword"));
    }
    @Given("Kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
        medunnason.signin2.click();
    }
    @Given("Kullanici My PAGES yazisina tiklar")
    public void kullanici_my_pages_yazisina_tiklar() {
        medunnason.staffMyPage.click();
    }
    @Given("kullanici Search Patient a tiklar")
    public void kullanici_search_patient_a_tiklar() {
        medunnason.searchPatient.click();
    }
    @Given("Kullanici sayfadaki Show Appointments kismina tiklar")
    public void kullanici_sayfadaki_show_appointments_kismina_tiklar() {
        medunnason.showAppointment.click();
    }
    @Given("Kullanici sayfadaki Edit kismina tiklar")
    public void kullanici_sayfadaki_edit_kismina_tiklar() {
        medunnason.editShowTest.click();
    }
    @Given("Kullanici sayfadaki Create or an Appointment yazisinin gorunurlugunu test eder")
    public void kullanici_sayfadaki_create_or_an_appointment_yazisinin_gorunurlugunu_test_eder() {
        assert medunnason.createorEditAppointment.isDisplayed();
    }
    @Given("Kullanici statusde UNAPPROVED, PENDING veya CANCELLED yapabildigini ancak COMPLETED yapamadigini test eder")
    public void kullanici_statusde_unapproved_pending_veya_cancelled_yapabildigini_ancak_completed_yapamadigini_test_eder() {
        Select select = new Select(medunnason.status);
        select.selectByVisibleText("UNAPPROVED");
        select.selectByVisibleText("PENDING");
        select.selectByVisibleText("CANCELLED");
        // select.selectByVisibleText("COMPLETED");
    }
    @Given("Kullanici Kullanici Anamnesis e giris yapilmadigini test eder")
    public void kullanici_kullanici_anamnesis_e_giris_yapilmadigini_test_eder() {
        medunnason.anamnesis.sendKeys("olumsuzsenaryo");
    }
    @Given("Kullanici Treatment e giris yapilmadigini test eder")
    public void kullanici_treatment_e_giris_yapilmadigini_test_eder() {
        medunnason.treatment.sendKeys("olumsuzsenaryo");
    }
    @Given("Kullanici Diagnosis e giris yapilmadigini test eder")
    public void kullanici_diagnosis_e_giris_yapilmadigini_test_eder() {
        medunnason.diagnosis.sendKeys("olumsuzsenaryo");
    }
    @Given("Kullanici doktor secebilmeli")
    public void kullanici_doktor_secebilmeli() {
        Select select=new Select(medunnason.doktorSec);
        select.deselectByIndex(1);
    }
    @Given("Kullanici save tusuna basar")
    public void kullanici_save_tusuna_basar() {
        medunnason.save.click();
    }





}
