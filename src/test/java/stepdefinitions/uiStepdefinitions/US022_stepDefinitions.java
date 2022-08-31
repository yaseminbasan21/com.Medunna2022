package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.US001_page;
import pages.US022_page;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US022_stepDefinitions {

    US001_page us001_page = new US001_page();
    US022_page us022_page = new US022_page();

    @Then("Staff staff hesabi ile siteye giris yapar")
    public void staff_staff_hesabi_ile_siteye_giris_yapar() {
        us001_page.girisIkon.click();
        us022_page.sginInButton.click();

        us022_page.usernametetxt.sendKeys(ConfigReader.getProperty("22staffUserName")
                + Keys.TAB
                +ConfigReader.getProperty("22Sifre"));

        us022_page.submitButton.click();

    }

    @Then("Staff MY PAGES sekmesinden Search Patient butonuna tiklar")
    public void staff_my_pages_sekmesinden_search_patient_butonuna_tiklar() {

        us022_page.myPageButton.click();

        us022_page.searhPatientButton.click();

    }

    @Then("Staff Patient SSN: text boxina bir SSN numarasi girer")
    public void staff_patient_ssn_text_boxina_bir_ssn_numarasi_girer() {

        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us22SSN"));

    }

    @Then("Staff aranan hastanin varligini kontrol eder")
    public void staff_aranan_hastanin_varligini_kontrol_eder() {

        assertTrue(us022_page.aranankullaniciSSN.isDisplayed());

    }


    @Then("Staff hastada gorunen Show Appointments butonuna tiklar")
    public void staff_hastada_gorunen_show_appointments_butonuna_tiklar() {

        ReusableMethods.waitFor(1);
        us022_page.show22Appo.click();

    }

    @Then("Staff Show Tests butonuna tiklar")
    public void staff_show_tests_butonuna_tiklar() {

        us022_page.show22Test.click();

    }

    @Then("Staff Tests sayfasinin acildigini kontrol eder")
    public void staff_tests_sayfasinin_acildigini_kontrol_eder() {

        assertTrue(us022_page.testsTitle.isDisplayed());

    }

    @Then("Staff testin gorunurlugunu test eder")
    public void staff_testin_gorunurlugunu_test_eder() {

        assertTrue(us022_page.arananAppoNum.isDisplayed());

    }

    @Then("Staff View Results butonuna tiklar")
    public void staff_view_results_butonuna_tiklar() {

        us022_page.viewResult.click();

    }

    @Then("Staff Test sonuclarinin gorunurlugunu test eder")
    public void staff_test_sonuclarinin_gorunurlugunu_test_eder() {

        assertTrue(us022_page.testID.isDisplayed());

    }


    @And("{int}sn bekler")
    public void snBekler(int sn) {

        ReusableMethods.waitFor(sn);

    }

    @Then("Staff hastada gorunen Edit butonuna tiklar")
    public void staff_hastada_gorunen_edit_butonuna_tiklar() {

        us022_page.edit22button.click();

    }

    @Then("Staff bilgilerin gorunur oldugunu test eder")
    public void staff_bilgilerin_gorunur_oldugunu_test_eder() {

        assertTrue(us022_page.id22.isDisplayed());
        assertTrue(us022_page.firstName22Hasta.isDisplayed());
        assertTrue(us022_page.lastName22Hakki.isDisplayed());

        assertTrue(us022_page.birthDate22TxtBox.isDisplayed());

        assertTrue(us022_page.email22.isDisplayed());
        assertTrue(us022_page.phone22.isDisplayed());

        assertTrue(us022_page.gender22TxtBox.isDisplayed());
        assertTrue(us022_page.bloodGroup22TxtBox.isDisplayed());
        assertTrue(us022_page.adress22TxtBox.isDisplayed());

        assertTrue(us022_page.userName22TxtBox.isDisplayed());
        assertTrue(us022_page.country22TxtBox.isDisplayed());
        assertTrue(us022_page.cstate22TxtBox.isDisplayed());

    }

    @Then("Staff bilgileri degistirip Save butonuna tiklar")
    public void staff_bilgileri_degistirip_save_butonuna_tiklar() {

        us022_page.firstName22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.firstName22TxtBox.sendKeys("degismishasta");

        us022_page.lastName22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.lastName22TxtBox.sendKeys("degismisHakki");

        us022_page.email22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.email22TxtBox.sendKeys("degismis@email.com");

        us022_page.phone22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.phone22TxtBox.sendKeys("444-333-2222");

        us022_page.saveButton.sendKeys(Keys.ENTER);

    }

    @Then("Staff basari mesajinin gorunurlugunu kontrol eder")
    public void staff_basari_mesajinin_gorunurlugunu_kontrol_eder() {

        assertTrue(us022_page.basariAlert.isDisplayed());

    }

    @Then("Staff bilgilerin degistigini kontrol eder")
    public void staff_bilgilerin_degistigini_kontrol_eder() {

        //us022_page.backButton.click();
        JSUtils.clickElementByJS(us022_page.backButton);

        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us22SSN"));
        ReusableMethods.waitFor(1);
        us022_page.edit22button.click();

        assertTrue(us022_page.degismisFirstName.isDisplayed());
        assertTrue(us022_page.degismisLastName.isDisplayed());
        assertTrue(us022_page.degismisEamil.isDisplayed());
        assertTrue(us022_page.degismisPhone.isDisplayed());

    }

    @Then("Staff bilgileri eski haline geri getirir")
    public void staff_bilgileri_eski_haline_geri_getirir() {

        us022_page.firstName22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.firstName22TxtBox.sendKeys(ConfigReader.getProperty("22FirstName"));

        us022_page.lastName22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.lastName22TxtBox.sendKeys(ConfigReader.getProperty("22LastName"));

        us022_page.email22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.email22TxtBox.sendKeys(ConfigReader.getProperty("22Email"));

        us022_page.phone22TxtBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us022_page.phone22TxtBox.sendKeys(ConfigReader.getProperty("22Phone"));

        us022_page.saveButton.sendKeys(Keys.ENTER);

    }

}
