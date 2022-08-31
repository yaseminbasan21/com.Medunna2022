package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US011_page;
import utilities.ConfigReader;
import utilities.Driver;


public class US011_stepDefinitions {
    Actions actions = new Actions(Driver.getDriver());
    US011_page us011Page = new US011_page();

    @Given("Doktor Medunna url'sine gider.")
    public void doktor_medunna_url_sine_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Then("Doktor giris yapar..")
    public void doktor_giris_yapar() throws InterruptedException {
        us011Page.profil.click();
        us011Page.Sing_in.click();
        us011Page.username.sendKeys("doctorbulentt");
        us011Page.password.sendKeys("asmn55");
        Thread.sleep(3333);
        us011Page.SİNG_İN.click();
        Thread.sleep(3333);

    }
    @Then("Doktor Sayfalarım bolumune gider.")
    public void doktor_sayfalarim_bolumune_gider() {
        us011Page.mypages.click();
    }
    @Then("Randevularım'a tiklar.")
    public void randevularim_a_tiklar() throws InterruptedException {
        us011Page.myAppoınment.click();
        Thread.sleep(3333);
    }
    @Then("Doktor randevudaki Duzenle butonuna tiklar.")
    public void doktor_randevudaki_duzenle_butonuna_tiklar() throws InterruptedException {
        us011Page.randevEdit.click();
        Thread.sleep(3333);
    }
    @Then("Doktor Randevu Oluştur veya Duzenle yazısını gorur.")
    public void doktor_randevu_oluştur_veya_duzenle_yazısını_gorur() {
        Assert.assertTrue(us011Page.randevuDuzenleDyazısını.isDisplayed());
    }
    @Then("Doktor hastanin ID bilgisini kontrol eder.")
    public void doktor_hastanin_id_bilgisini_kontrol_eder() throws InterruptedException {
        Assert.assertTrue(us011Page.appointmentId.isDisplayed());
        Thread.sleep(555);

    }
    @Then("Doktor hastanın RANDEVU baslangıc tarihi bilgisini kontrol eder.")
    public void doktor_hastanin_randevu_baslangıc_tarihi_bilgisini_kontrol_eder() throws InterruptedException {
        Assert.assertTrue(us011Page.startDate.isDisplayed());
        Thread.sleep(555);

    }
    @Then("Doktor hastanın RANDEVU bıtıs tarihi bilgisini kontrol eder.")
    public void doktor_hastanın_randevu_bıtıs_tarihi_bilgisini_kontrol_eder() throws InterruptedException {
        Assert.assertTrue(us011Page.endTime.isDisplayed());
        Thread.sleep(555);

    }
    @Then("Doktor hastanın STATUS durumunun bilgisini kontrol eder")
    public void doktor_hastanın_status_durumunun_bilgisini_kontrol_eder() {
        Assert.assertTrue(us011Page.status.isDisplayed());

    }
    @Then("Hastanın doktor bilgisi dogrulanır")
    public void hastanın_doktor_bilgisi_dogrulanır() {
        Assert.assertTrue(us011Page.doktorBil.isDisplayed());

    }
    @Then("Doktor gerekli alanları doldurur, anamnez, tedavi, teshis.Doktor, istege baglı alanlari recete ve açiklama ile doldurur.")
    public void doktor_gerekli_alanları_doldurur_anamnez_tedavi_teshis_doktor_istege_baglı_alanlari_recete_ve_açiklama_ile_doldurur() throws InterruptedException {
        us011Page.anamnezBİL.sendKeys("hasta gecmısı temız");
        us011Page.tedaviBil.sendKeys("tedavi edildi");
        us011Page.teshisBİL.sendKeys("imanı zayıf");
        Thread.sleep(555);

    }
    @Then("Doktor hastanın STATUS durumunu PENDING olarak degistirir.")
    public void doktor_hastanın_status_durumunu_pending_olarak_degistirir() throws InterruptedException {
        Select select=new Select(us011Page.statusDropDown);
        select.selectByValue("PENDING");
        Thread.sleep(555);

    }
    @Then("Doktor hastanın STATUS durumunu COMPLETED  olarak degistirir.")
    public void doktor_hastanın_status_durumunu_completed_olarak_degistirir() throws InterruptedException {
        Select select=new Select(us011Page.statusDropDown);
        select.selectByValue("COMPLETED");
        Thread.sleep(555);

    }
    @Then("Doktor hastanın STATUS durumunu CANCELLED olarak degistirir.")
    public void doktor_hastanın_status_durumunu_cancelled_olarak_degistirir() throws InterruptedException {
        Select select=new Select(us011Page.statusDropDown);
        select.selectByValue("CANCELLED");
        Thread.sleep(555);
        us011Page.ransaveButonu.submit();


    }
    @Then("Sayfa kapatilir..")
    public void sayfa_kapatilir() throws InterruptedException {

        Driver.closeDriver();

    }


}
