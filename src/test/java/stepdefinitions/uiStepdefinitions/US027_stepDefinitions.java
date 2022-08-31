package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US011_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US027_stepDefinitions {
    US011_page us011Page = new US011_page();
    SoftAssert softAssert = new SoftAssert();
    private org.openqa.selenium.JavascriptExecutor JavascriptExecutor;
    org.openqa.selenium.JavascriptExecutor js = (JavascriptExecutor);
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici URL Adresine Gider")
    public void kullanici_url_adresine_gider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(2222);
    }

    @Then("Kullanici Singin Butonuna Tıklar  Username,Sifre Girilir Sing Butonuna Tiklanir Admin olarak Giris Yapiir")
    public void kullanici_singin_butonuna_tıklar_username_sifre_girilir_sing_butonuna_tiklanir_admin_olarak_giris_yapiir() throws InterruptedException {
        us011Page.profil.click();
        us011Page.Sing_in.click();
        us011Page.username.sendKeys("team55.");
        us011Page.password.sendKeys("Team55..");
        Thread.sleep(3333);
        us011Page.SİNG_İN.click();
        Thread.sleep(5555);
    }

    @Then("Kullanici  Items&Titles Butonuna Tiklar")
    public void kullanici_ıtems_titles_butonuna_tiklar() throws InterruptedException {
        us011Page.itemButon.click();
        Thread.sleep(3333);
        us011Page.mesajButon.click();
        Thread.sleep(5555);
    }

    @Then("Kullanici Acilan  Menuden Messages Secenegine Tiklar")
    public void kullanici_acilan_menuden_messages_secenegine_tiklar() throws InterruptedException {
        Thread.sleep(3333);


    }
    @Then("Kullanici Messages Sayfasinin Acildigini Dogrular")
    public void kullanici_messages_sayfasinin_acildigini_dogrular() throws InterruptedException {
        Assert.assertTrue(us011Page.mesajSayfasiButon.isDisplayed());
        Thread.sleep(333);
    }

    @Then("Kullanici Messages Sayfasında  ID Basliginin Gorundugunu  Dogrular")
    public void kullanici_messages_sayfasında_ıd_basliginin_gorundugunu_dogrular() throws InterruptedException {
        Assert.assertTrue(us011Page.idButon.isDisplayed());
        Thread.sleep(333);

    }

    @Then("Kullanici Messages Sayfasında Email Basliginin Gorundugunu Dogrular")
    public void kullanici_messages_sayfasında_email_basliginin_gorundugunu_dogrular() throws InterruptedException {
        Assert.assertTrue(us011Page.emailButon.isDisplayed());
        Thread.sleep(333);

    }

    @Then("Kullanici Messages Sayfasında Name Basliginin Gorundugunu Dogrular")
    public void kullanici_messages_sayfasında_name_basliginin_gorundugunu_dogrular() throws InterruptedException {
        Assert.assertTrue(us011Page.nameButon.isDisplayed());
        Thread.sleep(333);

    }

    @Then("ID Baslıgını Tiklar Mesaj Listesi Siralanir ve Son Mesaja Kadar Liste Kaydirilir")
    public void ıd_baslıgını_tiklar_mesaj_listesi_siralanir_ve_son_mesaja_kadar_liste_kaydirilir() throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
       //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
       //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
       //Thread.sleep(2222); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);//Thread.sleep(3333); ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
       //Thread.sleep(2222);((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
       //Thread.sleep(2222);((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);


        Thread.sleep(2222);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        Thread.sleep(2222);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",us011Page.ListSonElement);
        Thread.sleep(2222);
        Assert.assertTrue(us011Page.ListSonElement.isDisplayed());
        Thread.sleep(2222);
        us011Page.ListSonElement.click();
        Thread.sleep(2222);

    }

    @Then("Kullanici Yeni Mesaj Olusturur")
    public void kullanici_yeni_mesaj_olusturur() throws InterruptedException {
        us011Page.newMesajButton.click();
        Thread.sleep(3333);
    }

    @Then("Kullanici İsim Email Baslik ve Mesaj İcerigi Girer Save Tiklar")
    public void kullanici_isim_email_baslik_ve_mesaj_icerigi_girer_save_tiklar() throws InterruptedException {
        us011Page.newMesajName.sendKeys("bulent.");
        us011Page.newMesajMail.sendKeys("blt@gmail.com");
        us011Page.newMesajKonu.sendKeys("asd.");
        us011Page.newMesajMesj.sendKeys("arayınız");
        Thread.sleep(3333);
        us011Page.newMesajSave.submit();
        Thread.sleep(3333);

    }

    @Then("Kullanici A New Mesaj Yazisini Gorur ve Dogrulanir")
    public void kullanici_a_new_mesaj_yazisini_gorur_ve_dogrulanir() throws InterruptedException {
        Assert.assertTrue(us011Page.messageKayitYesil.getText().contains("A new Message is created with identifier"));
        Thread.sleep(3333);

    }

    @Then("Kullanici İD Basligina Tiklar Mesaj Listesi Sıralanir")
    public void kullanici_id_basligina_tiklar_mesaj_listesi_sıralanir() throws InterruptedException {
       us011Page.idButon.click();
        Thread.sleep(3333);

    }

    @Then("Kullanici İlk MesajIn Edit Butonuna Tiklar Mesaja Ekleme Yapilir")
    public void kullanici_ilk_mesaj_ın_edit_butonuna_tiklar_mesaja_ekleme_yapilir() throws InterruptedException {
        us011Page.editMesaj.click();
        Thread.sleep(2222);

        us011Page.editMesajName.sendKeys("bulent");
        Thread.sleep(4444);
        us011Page.newMesajSave.submit();

        //Assert.assertTrue(us011Page.editMesajYesilyazi.isDisplayed());
        softAssert.assertTrue(us011Page.messageKayitYesil.getText().contains("A Message is updated with identifier"));
        Thread.sleep(3333);


    }

    @Then("Kullinici Save Butonuna Tiklar Yesil Yazi grunur")
    public void kullinici_save_butonuna_tiklar_yesil_yazi_grunur() throws InterruptedException {
       Thread.sleep(222);
    }

    @Then("Kullanici İlk Mesajın Delete Butonuna Tiklar Mesajı Siler")
    public void kullanici_ilk_mesajın_delete_butonuna_tiklar_mesajı_siler() throws InterruptedException {
        us011Page.deleteMesaj.click();
        us011Page.acianPencereDelleted.click();
        //softAssert.assertTrue(us011Page.deleteMesajYesilyazi.isDisplayed());
        softAssert.assertTrue(us011Page.messageKayitYesil.getText().contains("A Message is deleted with identifier"));


    }

}