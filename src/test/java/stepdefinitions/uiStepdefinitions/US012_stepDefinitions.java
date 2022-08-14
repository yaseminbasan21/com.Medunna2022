package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US011_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US012_stepDefinitions {

    US011_page us011Page = new US011_page();
    @Given("Doktor Medunna url'sine gider")
    public void doktor_medunna_url_sine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hmedunnaUrl"));

    }
    @Given("Doktor giriş yapar")
    public void doktor_giriş_yapar() throws InterruptedException { us011Page.profil.click();
        us011Page.Sing_in.click();
        us011Page.username.sendKeys("doctorbulentt");
        us011Page.password.sendKeys("asmn55");
        Thread.sleep(500);
        us011Page.SİNG_İN.click();
        Thread.sleep(500);

    }
    @Given("Doktor Sayfalarım bölümüne gider")
    public void doktor_sayfalarım_bölümüne_gider() {
        us011Page.mypages.click();

    }
    @Given("Randevularım'a tıklar")
    public void randevularım_a_tıklar() throws InterruptedException {
        us011Page.myAppoınment.click();
        Thread.sleep(555);

    }
    @Given("Doktor hasta randevusunda düzenle butonuna tıklar")
    public void doktor_hasta_randevusunda_düzenle_butonuna_tıklar() {
        us011Page.randevEdit.click();

    }
    @Given("Doktor test iste sekmesine tıklar.")
    public void doktor_test_iste_sekmesine_tıklar() throws InterruptedException {
        Thread.sleep(555);
        us011Page.doktorRequestATestButton.click();
        Thread.sleep(555);

    }
    @Given("Doktor Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin degerlerini secer")
    public void doktor_glucose_urea_creatinine_sodium_potassium_total_protein_albumin_hemoglobin_degerlerini_secer() throws InterruptedException {
        Thread.sleep(5555);
        Driver.clickWithJS(us011Page.testsPotassium);

        Driver.clickWithJS(us011Page.testsSodium);
        Assert.assertTrue(us011Page.testsSodium.isSelected());
        Driver.clickWithJS(us011Page.testsCreatine);
        Assert.assertTrue(us011Page.testsCreatine.isSelected());
        Driver.clickWithJS(us011Page.testsAlbumin);
        Assert.assertTrue(us011Page.testsAlbumin.isSelected());
        Driver.clickWithJS(us011Page.testsHemoglobin);
        Assert.assertTrue(us011Page.testsHemoglobin.isSelected());
        Driver.clickWithJS(us011Page.testsTotalProtein);
        Assert.assertTrue(us011Page.testsTotalProtein.isSelected());
        Driver.clickWithJS(us011Page.testsUrea);
        Assert.assertTrue(us011Page.testsUrea.isSelected());
        Driver.clickWithJS(us011Page.testsGlucose);
        Assert.assertTrue(us011Page.testsGlucose.isSelected());


    }

    @Given("Doktor kaydet butonuna tıklar")
    public void doktor_kaydet_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(555);

        us011Page.testsSaveButon.submit();

    }

}
