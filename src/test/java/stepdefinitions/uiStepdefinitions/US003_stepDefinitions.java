package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.US003_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US003_stepDefinitions {

    private WebDriver driver;

    US003_page ali = new US003_page();
    SoftAssert softAssert = new SoftAssert();


    @Given("Kullanıcı {string} sayfasına gider")
    public void KullanıcıSayfasınaGider(String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanıcı kullanıcı sembolüne tıklar")
    public void KullanıcıKullanıcıSembolüneTıklar() {
        ali.kullaniciSembol.click();

    }

    @Then("Kullanıcı register butonuna tıklar")
    public void KullanıcıRegisterButonunaTıklar() {
        ali.registerButon.click();
    }

    @Then("Kullanıcı tek haneli şifre  girer ve yeterli uzunlukta olmadığını görür")
    public void KullanıcıTekHaneliŞifreGirerVeYeterliUzunluktaOlmadığınıGörür() {
        ali.newPassword.sendKeys(ConfigReader.getProperty("birKarakter"));
        ali.comfirmationPassword.sendKeys(ConfigReader.getProperty("birKarakter"));
        Assert.assertTrue(ali.enAzDortKarakterOlmaliYazisi.isDisplayed());
        Assert.assertTrue(ali.passwordStrength1.isDisplayed());

    }

    @Then("Kullanıcı çift haneli şifre  girer ve yeterli uzunlukta olmadığını görür")
    public void KullanıcıÇiftHaneliŞifreGirerVeYeterliUzunluktaOlmadığınıGörür() {
        ali.newPassword.sendKeys(ConfigReader.getProperty("ikiKarakter"));
        ali.comfirmationPassword.sendKeys(ConfigReader.getProperty("ikiKarakter"));
        Assert.assertTrue(ali.enAzDortKarakterOlmaliYazisi.isDisplayed());
        Assert.assertTrue(ali.passwordStrength1.isDisplayed());

    }

    @Then("Kullanıcı uc haneli şifre  girer ve yeterli uzunlukta olmadığını görür")
    public void KullanıcıUcHaneliŞifreGirerVeYeterliUzunluktaOlmadığınıGörür() {
        ali.newPassword.sendKeys(ConfigReader.getProperty("ucKarakter"));
        ali.comfirmationPassword.sendKeys(ConfigReader.getProperty("ucKarakter"));
        Assert.assertTrue(ali.enAzDortKarakterOlmaliYazisi.isDisplayed());
        Assert.assertTrue(ali.passwordStrength1.isDisplayed());

    }

    @Then("Kullanıcı dort haneli şifre  girer ve kabul edildiğini görür")
    public void KullanıcıDortHaneliŞifreGirerVeKabulEdildiğiniGörür() throws InterruptedException {
        ali.newPassword.sendKeys(ConfigReader.getProperty("dortKarakter"));
        ali.comfirmationPassword.sendKeys(ConfigReader.getProperty("dortKarakter"));

        String expectedYazi = ConfigReader.getProperty("enAzDortKarakterOlmalıYazısı");
        Assert.assertFalse(expectedYazi, false);
        Assert.assertTrue(ali.passwordStrength1.isDisplayed());
        Thread.sleep(1000);
    }

    @Then("Kullanıcı içerisinde en az bir küçük harf olan yedi karakterli şifre girer")
    public void KullanıcıİçerisindeEnAzBirKüçükHarfOlanYediKrakterliŞifreGirer() throws InterruptedException {
        ali.newPassword.sendKeys(ConfigReader.getProperty("enAzBirKucukHarf"));
        Assert.assertTrue(ali.passwordStrength2.isDisplayed());
        Thread.sleep(1000);
    }

    @Then("Kullanıcı içerisinde en az bir büyük harf olan yedi karakterli şifre girer")
    public void KullanıcıİçerisindeEnAzBirBüyükHarfOlanYediKarakterliŞifreGirer()  {
        ali.newPassword.sendKeys(ConfigReader.getProperty("enAzBirBuyukHarf"));
        softAssert.assertTrue(ali.passwordStrength3.isDisplayed());

    }

    @Then("Kullanıcı içerisinde bir küçük bir büyük harf ve rakam olan yedi karakterli şifre girer")
    public void KullanıcıİçerisindeBirKüçükBirBüyükHarfVeRakamOlanYediKarakterliŞifreGirer() throws InterruptedException {
        ali.newPassword.sendKeys(ConfigReader.getProperty("buyukKucukHarfVeRakam"));
        Assert.assertTrue(ali.passwordStrength4.isDisplayed());
        Thread.sleep(1000);
    }
    @Then("Kullanıcı içerisinde bir küçük bir büyük harf  rakam ve özel karakter olan yedi karakterli şifre girer")
    public void KullanıcıİçerisindeBirKüçükBirBüyükHarfRakamVeÖzelKarakterOlanYediKarakterliŞifreGirer() throws InterruptedException {
        ali.newPassword.sendKeys(ConfigReader.getProperty("buyukKucukHarfRakamVeOzelKarakter"));
        Assert.assertTrue(ali.passwordStrength5.isDisplayed());
        Thread.sleep(1000);
    }



}
